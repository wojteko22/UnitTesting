package dawid;

import java.util.PriorityQueue;

/**
 * @author Dawid on 2016-03-09.
 */

class FCFS extends SchedulingAlgorithms {

    FCFS(PriorityQueue<Proces> queue) throws CloneNotSupportedException {
        super(queue);
    }

    @Override
    public double symulation() {

        while (!queue.isEmpty()) {
            if (sumaryTime < queue.peek().getPrepering())
                sumaryTime = queue.peek().getPrepering();
            averageWaitingTime += (sumaryTime - queue.peek().getPrepering());
            sumaryTime += queue.poll().getLength();
        }
        return averageWaitingTime / queueSize;
    }
}