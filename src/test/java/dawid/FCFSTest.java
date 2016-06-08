package dawid;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.PriorityQueue;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.isNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.when;

/**
 * @author Dawid on 2016-06-08.
 */
@RunWith(Parameterized.class)
public class FCFSTest {
    @Parameterized.Parameter
    public Proces p1;
    @Parameterized.Parameter    (value = 1)
    public Proces p2;
    @Parameterized.Parameter    (value = 2)
    public Proces p3;
    @Parameterized.Parameter    (value = 3)
    public Proces p4;
    @Parameterized.Parameter    (value = 4)
    public double result;

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] data=new Object[][]{
                {new Proces(0,8),new Proces(2,5),new Proces(3,3),new Proces(9,4),5.75},
                {new Proces(0,8),new Proces(9,5),new Proces(9,3),new Proces(9,4),3.25}
            };
        return Arrays.asList(data);
    }

    @Test
    public void testSymulation() throws Exception {
        PriorityQueue<Proces> queue=new PriorityQueue<>();
        queue.addAll(Arrays.asList(p1,p2,p3,p4));
        SchedulingAlgorithms algorithm=new FCFS(queue);
        assertThat(algorithm.symulation(),is(result));
    }
}