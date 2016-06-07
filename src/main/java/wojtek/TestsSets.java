package wojtek;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Wojciech Okoński
 *         created on 09.03.2016 r.
 */
public class TestsSets {
    private static Queue<Process> queue = new PriorityQueue<>(new ProcessComparator());

    private static Process p0 = new Process(0, 8),
            p1 = new Process(2, 5),
            p2 = new Process(3, 3),
            p3 = new Process(9, 4),
            p5 = new Process(9, 5),
            p6 = new Process(9, 3),
            p8 = new Process(0, 10),
            p9 = new Process(0, 6),
            p10 = new Process(0, 2),
            p11 = new Process(0, 4),
            p13 = new Process(0, 3),
            p14 = new Process(1, 2),
            p15 = new Process(0, 24),
            p19 = new Process(1, 4),
            p20 = new Process(2, 9),
            p21 = new Process(3, 5);


    private static Queue<Process> template(Process... processes) throws CloneNotSupportedException {
        queue.clear();
        for (Process process : processes) {
            queue.add(process.clone());
        }
        return queue;
    }

    public static Queue<Process> testSet1() throws CloneNotSupportedException {
        return template(p0, p1, p2, p3);
    }

    public static Queue<Process> testSet2() throws CloneNotSupportedException {
        return template(p0, p5, p6, p3);
    }

    public static Queue<Process> testSet3() throws CloneNotSupportedException {
        return template(p8, p9, p10, p11, p0);
    }

    public static Queue<Process> testSet4() throws CloneNotSupportedException {
        return template(p13, p14);
    }

    public static Queue<Process> testSet5() throws CloneNotSupportedException {
        return template(p15, p13, p13);
    }

    public static Queue<Process> testSet6() throws CloneNotSupportedException {
        return template(p0, p19, p20, p21);
    }
}
