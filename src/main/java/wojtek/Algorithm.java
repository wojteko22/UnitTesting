package wojtek;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Wojciech Okoński
 *         created on 16.03.2016 r.
 */
public abstract class Algorithm {
    protected Queue<Process> queue = new PriorityQueue<>(new ProcessComparator());
    protected int numberOfProcesses;

    public Algorithm(Queue<Process> queue) throws CloneNotSupportedException {
        for (Process process : queue) {
            this.queue.offer(process.clone());
        }
        numberOfProcesses = queue.size();
    }

    abstract public double simulate();

/*    public void printQueue() {
        for (Process process : queue) {
            System.out.println(process);
        }
    }*/
}
