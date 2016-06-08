package examples.seams;

/**
 * @author Dawid on 2016-06-08.
 */
class ConstructorInjection {
    private IExtensionManager manager;

    ConstructorInjection(IExtensionManager mgr) {
        manager = mgr;
    }

    boolean isValidLogFileName(String fileName) {
        return manager.isValid(fileName);
    }
}