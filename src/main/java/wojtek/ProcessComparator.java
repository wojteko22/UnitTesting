package wojtek;

import java.util.Comparator;

/**
 * @author Wojciech Okoński
 *         created on 05.03.2016 r.
 */
public class ProcessComparator implements Comparator<Process> {
    @Override
    public int compare(Process o1, Process o2) {
        if (o1.getTimeOfEntry() == o2.getTimeOfEntry()) return o1.getNumber() - o2.getNumber();
        return o1.getTimeOfEntry() - o2.getTimeOfEntry();
    }
}
