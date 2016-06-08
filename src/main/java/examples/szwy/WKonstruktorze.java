package examples.szwy;

/**
 * @author Dawid on 2016-06-08.
 */
class WKonstruktorze {
    private IExtensionManager menager;

    WKonstruktorze(IExtensionManager mgr) {
        menager = mgr;
    }

    boolean isValidLogFileName(String fileName) {
        return menager.isValid(fileName);
    }
}
