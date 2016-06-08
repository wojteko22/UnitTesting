package examples.szwy;

/**
 * @author Dawid on 2016-06-08.
 */
public class FactoryClass {
    private static IExtensionManager customManager = null;

    public static IExtensionManager create() {
        if (customManager != null)
            return customManager;
        return new FileExtensionManager();
    }

    public static void setManager(IExtensionManager mgr) {
        customManager = mgr;
    }
}
