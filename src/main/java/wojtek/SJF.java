package wojtek;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Wojciech Okoński
 *         created on 09.03.2016 r.
 */
public class SJF extends Algorithm {

    public SJF(Queue<Process> queue) throws CloneNotSupportedException {
        super(queue);
    }

    @Override
    public double simulate() {
        int time = 0;
        int sumOfAwaitingTime = 0;

        Queue<Process> readyProcesses = new PriorityQueue<>(new SJFComparator());

        while (!queue.isEmpty() || !readyProcesses.isEmpty()) {
            while (!queue.isEmpty() && queue.peek().getTimeOfEntry() <= time) {
                readyProcesses.add(queue.poll());
            }
            if (readyProcesses.isEmpty()) {
                time = queue.peek().getTimeOfEntry();
                readyProcesses.add(queue.poll());
            } else {
                Process nextProcess = readyProcesses.poll();
                sumOfAwaitingTime += (time - nextProcess.getTimeOfEntry());
                time += nextProcess.getLength();
            }
        }

        return (double) sumOfAwaitingTime / numberOfProcesses;
    }


}
