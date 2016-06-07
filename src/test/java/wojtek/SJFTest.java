package wojtek;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Wojciech Okoński
 *         created on 09.03.2016 r.
 */
public class SJFTest {

    @Test
    public void testSimulate() throws Exception {
        assertThat(new SJF(TestsSets.testSet1()).simulate(), is(5.0));
        assertThat(new SJF(TestsSets.testSet2()).simulate(), is(2.5));
        assertThat(new SJF(TestsSets.testSet3()).simulate(), is(8.0));
        assertThat(new SJF(TestsSets.testSet5()).simulate(), is(3.0));
        assertThat(new SJF(TestsSets.testSet6()).simulate(), is(7.75));
    }
}