package examples.szwy;

/**
 * @author Dawid on 2016-06-08.
 */
class UsingObjectFactory {
    private IExtensionManager manager;

    UsingObjectFactory() {
        manager = ObjectFactory.create();
    }

    boolean isValidLogFileName(String fileName) {
        return manager.isValid(fileName);
    }
}