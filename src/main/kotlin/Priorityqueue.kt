import java.util.LinkedList
import java.util.PriorityQueue
import java.util.Queue

fun main(args: Array<String>) {
    // P.Q = A FIFO data structure that serves elements with the
    // highest priorities first before elements with lower priority

    var gpaQueue = PriorityQueue<Double>()
    gpaQueue.offer(3.0)
    gpaQueue.offer(2.5)
    gpaQueue.offer(4.0)
    gpaQueue.offer(1.5)
    gpaQueue.offer(2.0)

    while (!gpaQueue.isEmpty()){
        println(gpaQueue.poll())
    }



}