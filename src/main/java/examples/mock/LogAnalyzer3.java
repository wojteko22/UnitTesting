package examples.mock;

/**
 * @author Dawid on 2016-06-08.
 */
public class LogAnalyzer3 {
    private IWebService service;

    public LogAnalyzer3(IWebService service) {
        this.service = service;
    }

    public void analyze(String fileName) {
        if (fileName.length() < 8) {
            service.LogError("Nazwa pliku jest zbyt krotka:" + fileName);
        }
    }
}
