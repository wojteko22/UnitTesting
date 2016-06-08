package examples.mock_and_stub;

/**
 * @author Dawid on 2016-06-08.
 */
class FakeWebService implements IWebService {
    Exception toThrow;

    @Override
    public void logError(String message) throws Exception {
        if (toThrow != null) {
            throw toThrow;
        }
    }
}