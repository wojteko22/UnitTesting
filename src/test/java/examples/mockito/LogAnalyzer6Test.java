package examples.mockito;

import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * @author Wojciech Okoński
 *         created on 08.06.2016 r.
 */
public class LogAnalyzer6Test {
    @Test
    public void analyze_LoggerThrows_CallsWebService() throws Exception {
        IWebService mockWebService = mock(IWebService.class);
        ILogger stubLogger = mock(ILogger.class);
        doThrow(new Exception("fake exception")).when(stubLogger).logError(anyString());

        LogAnalyzer6 analyzer = new LogAnalyzer6(stubLogger, mockWebService);
        analyzer.setMinNameLength(10);
        analyzer.analyze("Short.txt");

        verify(mockWebService).write(contains("fake exception"));
    }

    /*@Test
    public void analyze_LoggerThrows_CallsWebService2() {
        IWebService2 mockWebService = mock(IWebService2.class);
        ILogger stubLogger = mock(ILogger.class);
        doThrow(new RuntimeException("fake exception")).when(stubLogger).logError(anyString());
        LogAnalyzer6 analyzer = new LogAnalyzer6(stubLogger, mockWebService);
        analyzer.setMinNameLength(10);
        analyzer.analyze("Short.txt");

        verify(mockWebService).write(<Async<ErrorInfo>any());

        mockWebService.Received()
                .Write(Arg.Is < ErrorInfo > (info = > info.Severity == 1000
                        && info.Message.Contains("fake exception")));
    }*/

}