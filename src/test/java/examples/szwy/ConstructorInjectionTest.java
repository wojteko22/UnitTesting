package examples.szwy;


import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Dawid on 2016-06-08.
 */
public class ConstructorInjectionTest {

    @Test
    public void testIsValidLogFileName_NameSupportedExpresion_ReturnsTrue() throws Exception {
        FakeExtensionManager myFakeManager = new FakeExtensionManager();
        myFakeManager.willBeValid = true;
        ConstructorInjection log = new ConstructorInjection(myFakeManager);
        boolean result = log.isValidLogFileName("short.ext");
        assertTrue(result);
        assertThat(log.isValidLogFileName("short.ext"), is(true));
    }
}