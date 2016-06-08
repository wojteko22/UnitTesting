package dawid;

import java.util.Random;

/**
 * @author Dawid on 2016-03-05.
 */

/*Klas prece istancje tej klasy w sumulacjach uzywal bede jako
    proces w procesorze.
    Klasa ta zawiera pole id ktore jest numrem utoworzonego procesu
    pola finalne length i preparTime przechowuja odpowiednio czas fazy i czas zgloszenia do systemu
    pola duration i readyTime reprezentuja te same zeczy tylko w niektorych algorytmach beda one zminiane
    czas zgloszenia do systemu jest losowany z przedzialu od 0 do 100
    dlugosc fazy jest natomiast losowany w okolo 80 procentach przypadkow za zakresu od 10 do 100
    dla pozostalych 20 procent procesow z przedzialu od 100 do 1000
    */

class Proces implements Comparable<Proces>, Cloneable {
    private static int cout=1;
    private final Integer id=cout++;
    private final int length;
    private final int preparTime;
    private Integer duration;
    private Integer readyTime;

    public Proces(int startTime, int duration) {
        this.readyTime =startTime;
        this.duration = duration;
        length =duration;
        preparTime=readyTime;
    }

    Proces(){
        readyTime = new Random().nextInt(100);
        if (new Random().nextInt(100) < 80)
            duration = new Random().nextInt(90) + 10;
        else
            duration = new Random().nextInt(900) + 100;
        length =duration;
        preparTime=readyTime;
    }

    int getId() {
        return id;
    }

    public int getLength() {
        return length;
    }

    int getPrepering() {
        return preparTime;
    }

    int getDuration() {
        return duration;
    }

    void reduceDuration(int time){
        duration-=time;
    }

    int getReadyTime() {
        return readyTime;
    }

    void setReadyTime(Integer readyTime) {
        this.readyTime = readyTime;
    }

    @Override
    protected Proces clone() throws CloneNotSupportedException {
        return (Proces) super.clone();
    }

    @Override
    public String toString() {
        return "Proces{" +
                "id=" + id +
                ", duration=" + duration +
                ", readyTime=" + readyTime +
                '}';
    }

    @Override
    public int compareTo(Proces o) {
        int result=readyTime.compareTo(o.getReadyTime());
        return result==0?id.compareTo(o.getId()):result;
    }

}
