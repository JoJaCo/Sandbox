fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 89
    var isBlessed = true
    val isImmortal = false

    //Aura
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)

    val healthStatus = formatHealthStatus(healthPoints,isBlessed)
    //Player status
    printPlayerStatus(auraColor,isBlessed, name, healthStatus)

}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String {
    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds, but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }

        in 15..74 -> "Looks pretty hurt."
        else -> "is in awful condition!"
    }
    return healthStatus
}

private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    println("(Aura: $auraColor)" +
            "(Blessed: ${if (isBlessed) "Yes" else "NO"})")
    println("$name $healthStatus")

}
private fun auraColor(isBlessed: Boolean,
                      healthPoints: Int,
                      isImmortal:Boolean): String{
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "Green" else "Red"
    return auraColor
}
