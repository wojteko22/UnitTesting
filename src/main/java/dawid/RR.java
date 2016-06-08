package dawid;

import java.util.PriorityQueue;

/**
 * @author Dawid on 2016-03-10.
 */
class RR extends SchedulingAlgorithms {
    private PriorityQueue<Proces> ready = new PriorityQueue<>();
    private int quantTime;
    private int averageProcessDuring;

    //    Konstryktor urzywany do testow jednostkowych
    public RR(int quantTime, PriorityQueue<Proces> queue) throws CloneNotSupportedException {
        super(queue);
        this.quantTime = quantTime;
    }

    //    W kostruktorze wyliczamy srednia dlugosc fazy dla procesow z kolejki i na jej podtawie wyliczamy dlugosc kwantu czasu
    RR(PriorityQueue<Proces> queue, int quantTimePercent) throws CloneNotSupportedException {
        super(queue);
        for (Proces p : queue)
            averageProcessDuring += p.getLength();
        this.quantTime = (int) Math.round((averageProcessDuring / queueSize) * (quantTimePercent / 100.0));
    }

    /*Metoda sumulujaca dzialanie algorytmu procesy przechowywane na podstawie czasy zglaszanie w kolejce priorytetowej
    pobierane sa po uplywie odpowiednio dlugiego czasu (sumaryTime) przujmowane sa do kolejki zawierajacej gotowe procesy
    ready w ktorej przechowywane sa ze wzgledy na czas zgloszenia do niej durationnComparator w zaleznosci od tego czy procesy
    zmiszcza sie w kwancie czasu czy tez nie sa skracane i zwracane do kolejki ready z odpowiednio zminowny parametrem aby by za procesami
    ktore zglosily sie wczesniej badz usuwane*/
    @Override
    public double symulation() {

        while (!queue.isEmpty() || !ready.isEmpty()) {
            fillReady();
            Proces proces = ready.poll();

            if (proces.getDuration() > quantTime) {
                proces.reduceDuration(quantTime);
                sumaryTime += quantTime;
//                zeby  wszedl na koniec kolejki
                proces.setReadyTime(sumaryTime);
                ready.offer(proces);
            } else {
                sumaryTime += proces.getDuration();
                averageWaitingTime += (sumaryTime - proces.getLength() - proces.getPrepering());
            }
        }
        return averageWaitingTime / queueSize;
    }

    //    uzupelnienie kolejki gotowymi procesami
    private void fillReady() {
        if (ready.isEmpty() && sumaryTime < queue.peek().getReadyTime())
            sumaryTime = queue.peek().getReadyTime();

        while (!queue.isEmpty() && queue.peek().getReadyTime() <= sumaryTime)
            ready.offer(queue.poll());
    }
}
