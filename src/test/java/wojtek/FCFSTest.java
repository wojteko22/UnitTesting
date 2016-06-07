package wojtek;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Wojciech Okoński
 *         created on 09.03.2016 r.
 */
public class FCFSTest {
    @Test
    public void testSimulate() throws Exception {
        assertThat(new FCFS(TestsSets.testSet1()).simulate(), is(5.75));
        assertThat(new FCFS(TestsSets.testSet2()).simulate(), is(3.25));
        assertThat(new FCFS(TestsSets.testSet5()).simulate(), is(17.0));
    }
}