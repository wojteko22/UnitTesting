package examples.mockito;

/**
 * @author Wojciech Okoński
 *         created on 08.06.2016 r.
 */
class LogAnalyzer5 {
    private ILogger logger;
    private int minNameLength = 10;

    LogAnalyzer5(ILogger logger) {
        this.logger = logger;
    }

    void setMinNameLength(int minNameLength) {
        this.minNameLength = minNameLength;
    }

    void analyze(String fileName) {
        if(fileName.length() < minNameLength) {
            logger.logError("The file name is too short: " + fileName);
        }
    }
}
