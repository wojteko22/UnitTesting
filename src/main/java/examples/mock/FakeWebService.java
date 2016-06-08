package examples.mock;

/**
 * @author Dawid on 2016-06-08.
 */
class FakeWebService implements IWebService {
    Exception toThrow;

    @Override
    public void LogError(String message) throws Exception {
        if (toThrow!=null){
            throw toThrow;
        }
    }
}