package examples.seams;

/**
 * @author Dawid on 2016-06-08.
 */
public class FakeExtensionManager implements IExtensionManager {
    public boolean willBeValid = false;

    @Override
    public boolean isValid(String fileName) {
        return willBeValid;
    }
}