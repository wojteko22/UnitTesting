package examples.seams;

/**
 * @author Dawid on 2016-06-08.
 */
public class LogAnalyzer2 {
    public boolean isValidLogFileName(String fileName) {
        IExtensionManager manager = new FileExtensionManager();
        return manager.isValid(fileName);
    }
}