package examples.mock;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Dawid on 2016-06-08.
 */
public class FakeWebServiceTest {

    @Test
    public void analyze_TooShortFileName_CallsWebService(){
        FakeWebService mockService=new FakeWebService();
        LogAnalyzer3 log=new LogAnalyzer3(mockService);
        String shortFileName="abc.ext";

        log.analyze(shortFileName);
        assertThat(mockService.lastError,is("Nazwa pliku jest zbyt krotka:abc.ext"));
    }

}