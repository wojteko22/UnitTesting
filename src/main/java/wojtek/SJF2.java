package wojtek;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Wojciech Okoński
 *         created on 09.03.2016 r.
 */
public class SJF2 extends Algorithm {

    public SJF2(Queue<Process> queue) throws CloneNotSupportedException {
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
                Process nextProcess = readyProcesses.peek();
                sumOfAwaitingTime += (time - nextProcess.getTimeOfEntry());
                time += 1;
                if (nextProcess.getLength() == 1) {
                    readyProcesses.poll();
                } else {
                    nextProcess.lessQuantumOfTime(1);
                    nextProcess.setTimeOfEntry(time);
                }
            }
        }

        return (double) sumOfAwaitingTime / numberOfProcesses;
    }
}