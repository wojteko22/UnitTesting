package examples.seams.inheritance;

import examples.seams.FakeExtensionManager;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author Dawid on 2016-06-08.
 */
public class LogAnalyzer4Test {

    @Test
    public void overrideTest() throws Exception {
        FakeExtensionManager stub = new FakeExtensionManager();
        stub.willBeValid = true;
        TestableLogAnalyzer3 log = new TestableLogAnalyzer3(stub);

        boolean result = log.isValidLogFileName("file.esa");

        assertThat(result, is(true));
    }
}