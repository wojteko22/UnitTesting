package examples.mockito;

/**
 * @author Wojciech Okoński
 *         created on 08.06.2016 r.
 */
class LogAnalyzer6 {
    private ILogger logger;
    private IWebService webService;
    private int minNameLength = 10;

    LogAnalyzer6(ILogger logger, IWebService webService) {
        this.logger = logger;
        this.webService = webService;
    }

    void setMinNameLength(int minNameLength) {
        this.minNameLength = minNameLength;
    }

    void analyze(String filename) throws Exception {
        if (filename.length() < minNameLength) {
            try {
                logger.logError("The filename is too short: " + filename);
            } catch (Exception e) {
                webService.write("Error from logger: " + e);
            }
        }
    }
}