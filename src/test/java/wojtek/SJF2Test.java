package wojtek;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Wojciech Okoński
 *         created on 09.03.2016 r.
 */
public class SJF2Test {

    @Test
    public void testSimulate() throws Exception {
        assertThat(new SJF2(TestsSets.testSet6()).simulate(), is(6.5));
    }
}