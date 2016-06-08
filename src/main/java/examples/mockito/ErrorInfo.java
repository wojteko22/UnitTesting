package examples.mockito;

/**
 * @author Wojciech Okoński
 *         created on 08.06.2016 r.
 */
class ErrorInfo {
    private int severity;
    private String message;

    ErrorInfo(int severity, String message) {
        this.severity = severity;
        this.message = message;
    }

    int getSeverity() {
        return severity;
    }

    String getMessage() {
        return message;
    }
}
