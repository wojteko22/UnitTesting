package examples.szwy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Dawid on 2016-06-08.
 */
public class UsingObjectFactoryTest {

    @Test
    public void testIsValidLogFileName_SupportedEstension_ReturnsTrue() throws Exception {
        FakeExtensionManager manager = new FakeExtensionManager();
        manager.willBeValid = true;
        assertTrue(manager.isValid("obojetnieCo.sdf"));
        ObjectFactory.setManager(manager);
        UsingObjectFactory log = new UsingObjectFactory();
        assertTrue(log.isValidLogFileName("dafkl.fad"));
    }
}