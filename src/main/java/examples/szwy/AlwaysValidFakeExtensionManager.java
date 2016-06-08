package examples.szwy;

/**
 * Created by Dawid on 2016-06-08.
 */
public class AlwaysValidFakeExtensionManager implements IExtensionManager {
    @Override
    public boolean isValid(String fileName) {
        return true;
    }
}
