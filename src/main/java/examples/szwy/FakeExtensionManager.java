package examples.szwy;

/**
 * @author Dawid on 2016-06-08.
 */
class FakeExtensionManager implements IExtensionManager {
    boolean willBeValid = false;

    @Override
    public boolean isValid(String fileName) {
        return willBeValid;
    }
}
