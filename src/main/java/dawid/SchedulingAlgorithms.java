package dawid;

import java.util.PriorityQueue;

/**
 * Created by Dawid on 2016-03-16.
 */
/*Klasa abstrakcyjna zawieracjaca wspolene dla symulacji pola i konstruktor*/
abstract class SchedulingAlgorithms {
    protected PriorityQueue<Proces> queue = new PriorityQueue<>();
    double averageWaitingTime = 0;
    int sumaryTime = 0;
    int queueSize;

    SchedulingAlgorithms(PriorityQueue<Proces> queue) throws CloneNotSupportedException {
        for (Proces p : queue)
            this.queue.offer(p.clone());
        queueSize = queue.size();
    }

    public abstract double symulation();
}
