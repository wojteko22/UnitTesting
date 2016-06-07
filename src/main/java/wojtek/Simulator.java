package wojtek;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Wojciech Okoński
 *         created on 05.03.2016 r.
 */
public class Simulator {
    private int numberOfQueues;
    private int numberOfProcessesInEachQueue;
    private int version = 1;
    private Queue<Process> queue = new PriorityQueue<>(new ProcessComparator());

    public Simulator(int numberOfQueues, int numberOfProcessesInEachQueue, int version) throws CloneNotSupportedException {
        this.numberOfQueues = numberOfQueues;
        this.numberOfProcessesInEachQueue = numberOfProcessesInEachQueue;
        this.version = version;
        printResults();
    }

    private void newQueue() {
        queue.clear();
        for (int i = 0; i < numberOfProcessesInEachQueue; i++) {
            queue.offer(new Process(version));
        }
    }

    private void printResults() throws CloneNotSupportedException {
        double FCFSSum = 0, SJFSum = 0, SJF2Sum = 0, RRSum80 = 0, RRSum60 = 0, RRSum40 = 0, RRSum20 = 0, RRSum100 = 0, RRSum5 = 0;

        for (int i = 0; i < numberOfQueues; i++) {
            newQueue();
            FCFSSum += new FCFS(new PriorityQueue<>(queue)).simulate();
            SJFSum += new SJF(new PriorityQueue<>(queue)).simulate();
            SJF2Sum += new SJF2(new PriorityQueue<>(queue)).simulate();
            RRSum100 += new RR(new PriorityQueue<>(queue), 100).simulate();
            RRSum80 += new RR(new PriorityQueue<>(queue), 80).simulate();
            RRSum60 += new RR(new PriorityQueue<>(queue), 60).simulate();
            RRSum40 += new RR(new PriorityQueue<>(queue), 40).simulate();
            RRSum20 += new RR(new PriorityQueue<>(queue), 20).simulate();
            RRSum5 += new RR(new PriorityQueue<>(queue), 5).simulate();
        }
        System.out.printf("FCFS:\t%4.0f\n", FCFSSum / numberOfQueues);
        System.out.printf("SJF:\t%4.0f\n", SJFSum / numberOfQueues);
        System.out.printf("SJF(w):\t%4.0f\n", SJF2Sum / numberOfQueues);
        System.out.printf("RR100:\t%4.0f\n", RRSum100 / numberOfQueues);
        System.out.printf("RR80:\t%4.0f\n", RRSum80 / numberOfQueues);
        System.out.printf("RR60:\t%4.0f\n", RRSum60 / numberOfQueues);
        System.out.printf("RR40:\t%4.0f\n", RRSum40 / numberOfQueues);
        System.out.printf("RR20:\t%4.0f\n", RRSum20 / numberOfQueues);
        System.out.printf("RR5:\t%4.0f\n", RRSum5 / numberOfQueues);
        System.out.println();
    }
}
