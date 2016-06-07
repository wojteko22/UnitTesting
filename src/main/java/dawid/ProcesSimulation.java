package dawid;

import java.util.PriorityQueue;

/**
 * Created by Dawid on 2016-03-05.
 */

/*Klasa odpalajaca symulacje dla 20 kolejek z 50 procesami
    zliczajaca sredni czas oczekiwania dla procesow a nastepnie wypisujaca
    rezultataty na konsole
*/
public class ProcesSimulation {
    private int numberOfQueues;
    private int numberOfElementsInTheQueue;
    private double Fcfs, Sjf, Sjfw, Rr20, Rr50, Rr80, Rr100;

    private ProcesSimulation(int numberOfQueues, int numberOfElementsInTheQueue) {
        this.numberOfQueues = numberOfQueues;
        this.numberOfElementsInTheQueue = numberOfElementsInTheQueue;
    }

    //  Metoda losujaca procesy do kolejki
    private PriorityQueue<Proces> queueFactory() {
        PriorityQueue<Proces> result = new PriorityQueue<>();
        for (int i = 0; i < numberOfElementsInTheQueue; i++)
            result.offer(new Proces());
        return result;
    }

    public void simulate() throws CloneNotSupportedException {

        for (int i = 0; i < numberOfQueues; i++) {
            PriorityQueue<Proces> list = queueFactory();
            Fcfs += new FCFS(list).symulation();
            Sjf += new SJF(list).symulation();
            Sjfw += new SJFw(list).symulation();
            Rr20 += new RR(list, 20).symulation();
            Rr50 += new RR(list, 40).symulation();
            Rr80 += new RR(list, 60).symulation();
            Rr100 += new RR(list, 80).symulation();
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("%-10s= %-20.4f%n", "FCFS", Fcfs / numberOfQueues));
        sb.append(String.format("%-10s= %-20.4f%n", "SJF", Sjf / numberOfQueues));
        sb.append(String.format("%-10s= %-20.4f%n", "SJFw", Sjfw / numberOfQueues));
        sb.append(String.format("%-10s= %-20.4f%n", "RR20", Rr20 / numberOfQueues));
        sb.append(String.format("%-10s= %-20.4f%n", "RR40", Rr50 / numberOfQueues));
        sb.append(String.format("%-10s= %-20.4f%n", "RR60", Rr80 / numberOfQueues));
        sb.append(String.format("%-10s= %-20.4f%n", "RR80", Rr100 / numberOfQueues));
        return sb.toString();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ProcesSimulation symulacja = new ProcesSimulation(20, 50);
        symulacja.simulate();
        System.out.println(symulacja);
    }
}
