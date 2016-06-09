package examples.mockito;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * @author Wojciech Okoński
 *         created on 08.06.2016 r.
 */
public class LogAnalyzer5Test {

    @Test
    public void analyze_TooShortFileName_CallLogger() throws Exception {
        ILogger mockedLogger = mock(ILogger.class);
        LogAnalyzer5 analyzer = new LogAnalyzer5(mockedLogger);
        analyzer.setMinNameLength(6);

        analyzer.analyze("a.txt");

        verify(mockedLogger).logError("The file name is too short: a.txt");
    }
}