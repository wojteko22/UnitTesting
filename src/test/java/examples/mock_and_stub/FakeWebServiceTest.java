package examples.mock_and_stub;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * @author Dawid on 2016-06-08.
 */
public class FakeWebServiceTest {

    @Test
    public void analyze_WebServiceThrows_SendEmail() {
        FakeWebService stubService = new FakeWebService();
        stubService.toThrow = new Exception("Fake exception");
        FakeEmailService mockEmail = new FakeEmailService();
        LogAnalyzer4 log = new LogAnalyzer4(stubService, mockEmail);
        String shortFileName = "abc.ext";

        log.analyze(shortFileName);

        assertThat(mockEmail.to, containsString("someone@somewhere.com"));
        assertThat(mockEmail.body, containsString("Fake exception"));
        assertThat(mockEmail.subject, containsString("Brak mozliwosci rejestracji"));
    }
}