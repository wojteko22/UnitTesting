package examples.szwy;

/**
 * @author  Dawid on 2016-06-08.
 */
public class WKonstruktorze {
    private IExtensionManager menager;

    public WKonstruktorze(IExtensionManager mgr){
        menager=mgr;
    }
    public boolean isValidLogFileName(String fileName){
        return menager.isValid(fileName);
    }
}
