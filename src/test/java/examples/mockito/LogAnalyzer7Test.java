package examples.mockito;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * @author Wojciech Okoński
 *         created on 08.06.2016 r.
 */
public class LogAnalyzer7Test {
    @Test
    public void analyze_LoggerThrows_CallsWebService() throws Exception {
        IWebService mockWebService = mock(IWebService.class);
        ILogger stubLogger = mock(ILogger.class);
        doThrow(new Exception("fake exception")).when(stubLogger).logError(anyString());
        LogAnalyzer7 analyzer = new LogAnalyzer7(stubLogger, mockWebService);
        analyzer.setMinNameLength(10);
        analyzer.analyze("Short.txt");
        ArgumentCaptor<ErrorInfo> argument = ArgumentCaptor.forClass(ErrorInfo.class);

        verify(mockWebService).write(argument.capture());
        int severity = argument.getValue().getSeverity();
        String message = argument.getValue().getMessage();

        assertThat(severity, is(1000));
        assertThat(message, containsString("fake exception"));
    }

}