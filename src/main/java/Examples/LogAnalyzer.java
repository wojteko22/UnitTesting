package examples;

/**
 * Created by Dawid on 2016-06-07.
 */
public class LogAnalyzer {
    private boolean WasLastFileNameValid;

    public boolean IsValidLogFileName(String fileName){
        WasLastFileNameValid=false;
        if (fileName==null || fileName.isEmpty()){
            throw new IllegalArgumentException("nalezy podac nazwe pliku");
        }
        if (!fileName.toUpperCase().endsWith(".SLF")){
            return false;
        }
        WasLastFileNameValid=true;
        return true;
    }

    public boolean isWasLastFileNameValid() {
        return WasLastFileNameValid;
    }

    public void setWasLastFileNameValid(boolean wasLastFileNameValid) {
        WasLastFileNameValid = wasLastFileNameValid;
    }
}
