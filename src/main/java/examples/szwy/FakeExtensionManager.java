package examples.szwy;

/**
 * Created by Dawid on 2016-06-08
 */
public class FakeExtensionManager implements IExtensionManager {
    public boolean WillBeValid=false;
    @Override
    public boolean isValid(String fileName) {
        return WillBeValid;
    }
}
