package examples.seams.inheritance;

import examples.seams.FileExtensionManager;
import examples.seams.IExtensionManager;

/**
 * @author Dawid on 2016-06-08.
 */
class LogAnalyzer3 {
    public boolean isValidLogFileName(String fileName) {
        return getManager().isValid(fileName);
    }

    protected IExtensionManager getManager() {
        return new FileExtensionManager();
    }
}
