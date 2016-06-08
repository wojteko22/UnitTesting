package dawid;

import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;

/**
 * @author Dawid on 2016-06-08.
 */
public class FillReadyTest extends SJFw {

    public Collection result=new ArrayList<>();

    FillReadyTest(PriorityQueue<Proces> queue) throws CloneNotSupportedException {
        super(queue);
    }

    @Override
    public double symulation() {
        while (!queue.isEmpty()) {
            fillReady();
            result.addAll(ready);
            ready.clear();
        }
        return 0.0;
    }
}
