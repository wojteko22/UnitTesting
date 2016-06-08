package dawid;

import java.util.Comparator;

/**
 * @author Dawid on 2016-03-10.
 */
class DurationComparator implements Comparator<Proces>{
    @Override
    public int compare(Proces o1, Proces o2) {
        int result=o1.getDuration()-o2.getDuration();
        return result==0?(o1.getId()-o2.getId()):result;
    }
}
