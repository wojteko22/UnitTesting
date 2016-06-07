package wojtek;

import java.util.Random;

/**
 * @author Wojciech Okoński
 *         created on 05.03.2016 r.
 */
public class Process implements Cloneable {
    private static int time;
    private int number = nextNumber++;
    private static int nextNumber = 1;
    private int timeOfEntry;
    private int length;

    public Process(int version) {
        switch (version) {
            case 1:
                timeOfEntry = new Random().nextInt(10);
                time = timeOfEntry;
                if (new Random().nextInt(100) < 80) {
                    length = new Random().nextInt(10) + 10;
                } else {
                    length = new Random().nextInt(90) + 10;
                }
                break;
            case 2:
                timeOfEntry = time + new Random().nextInt(10);
                time = timeOfEntry;
                if (new Random().nextInt(100) < 80) {
                    length = new Random().nextInt(10) + 1;
                } else {
                    length = new Random().nextInt(901) + 100;
                }
                break;
            case 3:
                timeOfEntry = time + new Random().nextInt(10);
                time = timeOfEntry;
                length = new Random().nextInt(100) + 1;
                break;
            case 4:
                timeOfEntry = time + new Random().nextInt(1);
                time = timeOfEntry;
                if (new Random().nextInt(100) < 80) {
                    length = new Random().nextInt(9) + 2;
                } else {
                    length = new Random().nextInt(21) + 80;
                }
                break;
            case 5:
                timeOfEntry = time + new Random().nextInt(10);
                time = timeOfEntry;
                length = time;
        }
    }


    public Process(int timeOfEntry, int length) {
        this.timeOfEntry = timeOfEntry;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    int getTimeOfEntry() {
        return timeOfEntry;
    }

    int getNumber() {
        return number;
    }

    void lessQuantumOfTime(int quantum) {
        length -= quantum;
    }

    void setTimeOfEntry(int timeOfEntry) {
        this.timeOfEntry = timeOfEntry;
    }

    @Override
    public String toString() {
        return "Process{" +
                "number=" + number +
                ", timeOfEntry=" + timeOfEntry +
                ", length=" + length +
                '}';
    }

    @Override
    public Process clone() throws CloneNotSupportedException {
        Process process = (Process) super.clone();
        process.number = nextNumber++;
        return process;
    }
}
