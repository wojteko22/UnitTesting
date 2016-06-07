package wojtek;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Wojciech Okoński
 *         created on 09.03.2016 r.
 */
public class RRTest {

    @Test
    public void testSimulate() throws Exception {
        assertThat(new RR(TestsSets.testSet3(), 2, false).simulate(), is(14.4));
        assertThat(new RR(TestsSets.testSet4(), 2, false).simulate(), is(1.5));
        assertThat(new RR(TestsSets.testSet5(), 4, false).simulate(), is(17.0 / 3));
    }
}