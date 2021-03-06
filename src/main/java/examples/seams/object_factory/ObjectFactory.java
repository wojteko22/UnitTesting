package examples.seams.object_factory;

import examples.seams.FileExtensionManager;
import examples.seams.IExtensionManager;

/**
 * @author Dawid on 2016-06-08.
 */
class ObjectFactory {
    private static IExtensionManager customManager = null;

    static IExtensionManager create() {
        if (customManager != null)
            return customManager;
        return new FileExtensionManager();
    }

    static void setManager(IExtensionManager mgr) {
        customManager = mgr;
    }
}