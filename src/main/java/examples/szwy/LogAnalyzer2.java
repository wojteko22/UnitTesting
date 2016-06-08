package examples.szwy;

/**
 * Created by Dawid on 2016-06-08
 */
public class LogAnalyzer2 {
    public boolean isValidLogFileName(String fileName) {
        IExtensionManager menager = new FileExtensionManager();
        return menager.isValid(fileName);
    }
}


