package pakiet;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Wojciech Okoński
 *         created on 09.06.2016 r.
 */
public class SimpleExampleTest {
    @Test
    public void factorial() throws Exception {
        //arrange
        SimpleExample myObj = new SimpleExample();

        //act
        int result = myObj.factorial(1);

        //assert
//        assertEquals(1, result);
        assertThat(result, CoreMatchers.is(1));
    }

}