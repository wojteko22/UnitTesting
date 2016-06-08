package examples.szwy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Dawid on 2016-06-08.
 */
public class SetterInjectionTest {

    @Test
    public void testIsValidLogFileName() throws Exception {
        FakeExtensionManager myFakeManager = new FakeExtensionManager();
        myFakeManager.willBeValid = true;
        SetterInjection log = new SetterInjection();
        log.setManager(myFakeManager);
        assertThat(log.isValidLogFileName("nibyMaBycDobre.ese"), is(true));
    }
}