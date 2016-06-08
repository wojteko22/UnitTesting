package dawid;

import java.util.PriorityQueue;

/**
 * @author Dawid on 2016-03-10.
 */
class SJFw extends SchedulingAlgorithms {
    protected PriorityQueue<Proces> ready = new PriorityQueue<>(new DurationComparator());
    //    pole reprezentujace czas do przyjecia nastepnego gotowego procesu
    private int toNextReady = 0;

    SJFw(PriorityQueue<Proces> queue) throws CloneNotSupportedException {
        super(queue);
    }

    /*Metoda symulujaca dzialanie algorytmu dziala ona na kolejce procesow gotowych posortowanej ze wzgledu na dlugosc
    fazy procesu. Kolejka jest uzupelniana i monitorowana na bierzaco dzieki polu to nextReady przechowujacym czas do
    zagloszenia nastepnego procesu z kolejki queue posortowanej ze wzgledu na czas zglaszania procesow
    jezeli w kolejce ready pojawi sie proces o fazie krotszej niz procesu aktualnie wykonywanego nastepuje zmiana procesu
    na ten o krotszej fazie a ten zamieniany odkladamy do kolejki ready.
    Jezeli do czasu pojawienia sie nastepnego procesy zdarzy wykonac kilka procesow wykonujemy kilka najkrotszych
    * */
    @Override
    public double symulation() {

        while (!queue.isEmpty() || !ready.isEmpty()) {
            fillReady();
            boolean checkNext = false;
            while (!checkNext && !ready.isEmpty()) {
                Proces proces = ready.poll();
                if (toNextReady - proces.getDuration() >= 0 || queue.isEmpty()) {
                    sumaryTime += proces.getDuration();
                    averageWaitingTime += (sumaryTime - proces.getLength() - proces.getPrepering());
                    toNextReady -= proces.getDuration();
                } else {
                    proces.reduceDuration(toNextReady);
                    ready.offer(proces);
                    sumaryTime += toNextReady;
                    checkNext = true;
                    toNextReady = 0;
                }
            }
        }
        return averageWaitingTime / queueSize;
    }

    //  Metoda uzupelniajaca kolejke procesow gotowych
    protected void fillReady() {
        if (ready.isEmpty())
            sumaryTime = queue.peek().getPrepering();

        while (!queue.isEmpty() && queue.peek().getPrepering() == sumaryTime)
            ready.offer(queue.poll());

        if (!queue.isEmpty())
            toNextReady = queue.peek().getPrepering() - sumaryTime;
    }
}
