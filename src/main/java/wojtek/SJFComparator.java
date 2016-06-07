package wojtek;

import java.util.Comparator;

/**
 * @author Wojciech Okoński
 *         created on 05.03.2016 r.
 */
class SJFComparator implements Comparator<Process> {
    @Override
    public int compare(Process o1, Process o2) {
        if (o1.getLength() == o2.getLength()) return o1.getNumber() - o2.getNumber();
        return o1.getLength() - o2.getLength();
    }
}

