package examples.szwy;

/**
 * @author Dawid on 2016-06-08.
 */
class Setter_Getter {
    private IExtensionManager menager;

    Setter_Getter() {
        menager = new FileExtensionManager();
    }

    boolean isValidLogFileName(String fileName) {
        return menager.isValid(fileName);
    }

    public IExtensionManager getMenager() {
        return menager;
    }

    void setMenager(IExtensionManager menager) {
        this.menager = menager;
    }
}
