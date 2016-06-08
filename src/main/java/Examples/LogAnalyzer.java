package examples;

/**
 * @author Dawid on 2016-06-08.
 */
class LogAnalyzer {
    private boolean WasLastFileNameValid;

    boolean IsValidLogFileName(String fileName) {
        WasLastFileNameValid = false;
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("nalezy podac nazwe pliku");
        }
        if (!fileName.toUpperCase().endsWith(".SLF")) {
            return false;
        }
        WasLastFileNameValid = true;
        return true;
    }

    boolean isWasLastFileNameValid() {
        return WasLastFileNameValid;
    }

//    public void setWasLastFileNameValid(boolean wasLastFileNameValid) {
//        WasLastFileNameValid = wasLastFileNameValid;
//    }
}
