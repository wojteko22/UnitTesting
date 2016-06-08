package examples.seams;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author Dawid on 2016-06-08.
 */
public class UsingObjectFactoryTest {

    @Test
    public void testIsValidLogFileName_SupportedEstension_ReturnsTrue() throws Exception {
        FakeExtensionManager manager = new FakeExtensionManager();
        manager.willBeValid = true;
        ObjectFactory.setManager(manager);
        UsingObjectFactory log = new UsingObjectFactory();

        boolean result = log.isValidLogFileName("dafkl.fad");

        assertThat(result, is(true));
    }
}