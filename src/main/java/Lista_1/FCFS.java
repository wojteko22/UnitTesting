package Lista_1;

import java.util.PriorityQueue;

/**
 * Created by Dawid on 2016-03-09.
 */

public class FCFS extends SchedulingAlgorithms {

    public FCFS(PriorityQueue<Proces> queue) throws CloneNotSupportedException {
        super(queue);
    }

    @Override
    public double symulation(){

        while (!queue.isEmpty()){
            if (sumaryTime<queue.peek().getPrepering())
                sumaryTime=queue.peek().getPrepering();
            averageWaitingTime+=(sumaryTime-queue.peek().getPrepering());
            sumaryTime+=queue.poll().getLength();
        }
        return averageWaitingTime/queueSize;
    }
}
