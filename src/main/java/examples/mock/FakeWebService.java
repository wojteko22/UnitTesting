package examples.mock;

/**
 * @author Dawid on 2016-06-08.
 */
public class FakeWebService implements IWebService {
    public String lastError;

    @Override
    public void LogError(String message) {
        lastError = message;
    }
}
