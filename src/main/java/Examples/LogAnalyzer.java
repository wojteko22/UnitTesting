package examples;

/**
 * @author Dawid on 2016-06-08.
 */
class LogAnalyzer {
    private boolean wasLastFileNameValid;

    boolean isValidLogFileName(String fileName) {
        wasLastFileNameValid = false;
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("nalezy podac nazwe pliku");
        }
        if (!fileName.toUpperCase().endsWith(".SLF")) {
            return false;
        }
        wasLastFileNameValid = true;
        return true;
    }

    boolean getWasLastFileNameValid() {
        return wasLastFileNameValid;
    }
}