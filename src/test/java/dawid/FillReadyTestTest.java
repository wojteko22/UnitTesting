package dawid;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.PriorityQueue;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Dawid on 2016-06-08.
 */
@RunWith(Parameterized.class)
public class FillReadyTestTest {
    @Parameterized.Parameter
    public Proces p1;
    @Parameterized.Parameter(value = 1)
    public Proces p2;
    @Parameterized.Parameter(value = 2)
    public Proces p3;
    @Parameterized.Parameter(value = 3)
    public Proces p4;
    @Parameterized.Parameter(value = 4)
    public double result;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {new Proces(0, 8), new Proces(2, 5), new Proces(3, 3), new Proces(9, 4), 4.0},
                {new Proces(0, 8), new Proces(1, 4), new Proces(2, 9), new Proces(3, 5), 6.5}
        };
        return Arrays.asList(data);
    }

    @Test
    public void testFillReady_Filling_ReadyEqualsQueue() throws Exception {
        Collection<Proces> collection = Arrays.asList(p1, p2, p3, p4);
        PriorityQueue<Proces> queue = new PriorityQueue<>();
        queue.addAll(collection);

        FillReadyTest algorithm = new FillReadyTest(queue);
        algorithm.symulation();
        assertArrayEquals(collection.toArray(),algorithm.result.toArray());
    }

//    @Test
//    public void testSymulation_SymulationResult_ReturnEqualsResult() throws Exception{
//        PriorityQueue<Proces> queue = new PriorityQueue<>();
//        queue.addAll(Arrays.asList(p1, p2, p3, p4));
//        SchedulingAlgorithms algorithm = new SJFw(queue);
//        assertThat(algorithm.symulation(), is(result));
//    }
}