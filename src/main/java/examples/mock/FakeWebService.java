package examples.mock;

/**
 * @author Dawid on 2016-06-08.
 */
class FakeWebService implements IWebService {
    String lastError;

    @Override
    public void LogError(String message) {
        lastError = message;
    }
}