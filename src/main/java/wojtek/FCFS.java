package wojtek;

import java.util.Queue;

/**
 * @author Wojciech Okoński
 *         created on 09.03.2016 r.
 */
class FCFS extends Algorithm {

    FCFS(Queue<Process> queue) throws CloneNotSupportedException {
        super(queue);
    }

    @Override
    public double simulate() {
        int time = queue.peek().getTimeOfEntry() + queue.poll().getLength();
        int sumOfAwaitingTime = 0;

        while (!queue.isEmpty()) {
            Process process = queue.poll();
            if (process.getTimeOfEntry() > time) {
                time = process.getTimeOfEntry();
            }
            sumOfAwaitingTime += (time - process.getTimeOfEntry());
            time += process.getLength();
        }

        return (double) sumOfAwaitingTime / numberOfProcesses;
    }
}
