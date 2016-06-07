package Lista_1;

import java.util.PriorityQueue;

/**
 * Created by Dawid on 2016-03-16.
 */
/*Klasa abstrakcyjna zawieracjaca wspolene dla symulacji pola i konstruktor*/
public abstract class SchedulingAlgorithms {
    protected PriorityQueue<Proces> queue=new PriorityQueue<>();
    protected double averageWaitingTime=0;
    protected int sumaryTime=0;
    protected int queueSize;

    public SchedulingAlgorithms(PriorityQueue<Proces> queue) throws CloneNotSupportedException {
        for (Proces p: queue)
            this.queue.offer(p.clone());
        queueSize=queue.size();
    }

    public abstract double symulation();
}
