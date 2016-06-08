package examples.seams;

/**
 * @author Dawid on 2016-06-08.
 */
class SetterInjection {
    private IExtensionManager manager;

    SetterInjection() {
        manager = new FileExtensionManager();
    }

    boolean isValidLogFileName(String fileName) {
        return manager.isValid(fileName);
    }

//    public IExtensionManager getManager() {
//        return manager;
//    }

    void setManager(IExtensionManager manager) {
        this.manager = manager;
    }
}