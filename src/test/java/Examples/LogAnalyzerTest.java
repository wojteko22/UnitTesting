package examples;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Dawid on 2016-06-08.
 */
@RunWith(Parameterized.class)
public class LogAnalyzerTest {
    @Parameterized.Parameter
    public String fileName;
    @Parameterized.Parameter(value = 1)
    public boolean expected;


    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{"dahahaha.ssi", false}, {"froog.foo", false}, {"goodfile.slf", true}};
        return Arrays.asList(data);
    }

    @Test()
    public void testIsValidLogFileName_WhenCalled_ChangesWasLastFileNameValid() throws Exception {
        LogAnalyzer la = new LogAnalyzer();
        la.isValidLogFileName(fileName);
        Assert.assertEquals(expected, la.isWasLastFileNameValid());
    }
}