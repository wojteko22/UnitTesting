package examples.szwy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Dawid on 2016-06-08.
 */
public class VirtualMethodsTest {

    @Test
    public void testIsVirtualLogFileName() throws Exception {
        FakeExtensionManager stub = new FakeExtensionManager();
        stub.WillBeValid=true;
        TestVirtual log = new TestVirtual(stub);
        assertTrue(log.isValidLogFileName("file.esa"));
    }
}