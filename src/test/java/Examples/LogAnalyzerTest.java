package examples;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
// TODO: 08.06.2016 Zmienić ten template. 
/**
 * Created by Dawid on 2016-06-07.
 */
@RunWith(Parameterized.class)
public class LogAnalyzerTest {
    @Parameterized.Parameter
    public String fileName;
    @Parameterized.Parameter (value = 1)
    public boolean expected;


    @Parameters
    public static Collection<Object[]> data(){
        Object[][] data=new Object[][]{{"dahaha.ssi",false},{"froog.foo",false},{"goodfile.slf",true}};
        return Arrays.asList(data);
    }

    @Test()
    public void testIsValidLogFileName_WhenCalled_ChangesWasLastFileNameValid() throws Exception {
        LogAnalyzer la=new LogAnalyzer();
        la.IsValidLogFileName(fileName);
        Assert.assertEquals(expected,la.isWasLastFileNameValid());
    }
}