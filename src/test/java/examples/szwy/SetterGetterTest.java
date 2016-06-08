package examples.szwy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Dawid on 2016-06-08.
 */
public class SetterGetterTest {

    @Test
    public void testIsValidLogFileName() throws Exception {
        FakeExtensionManager myFakeManager = new FakeExtensionManager();
        myFakeManager.WillBeValid = true;
        Setter_Getter log = new Setter_Getter();
        log.setMenager(myFakeManager);
        assertThat(log.isValidLogFileName("nibyMaBycDobre.ese"), is(true));
    }
}