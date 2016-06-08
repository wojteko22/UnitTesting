package examples.mock;

/**
 * @author Dawid on 2016-06-08.
 */
class LogAnalyzer4 {
    private IWebService service;

    LogAnalyzer4(IWebService service) {
        this.service = service;
    }

    void analyze(String fileName) {
        if (fileName.length() < 8) {
            service.LogError("File name is too short: " + fileName);
        }
    }
}