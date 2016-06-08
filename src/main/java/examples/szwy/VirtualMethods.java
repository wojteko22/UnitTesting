package examples.szwy;

/**
 * @author Dawid on 2016-06-08.
 */
public class VirtualMethods {
    public boolean isValidLogFileName(String fileName){
        return getManager().isValid(fileName);
    }

    protected IExtensionManager getManager(){
        return new FileExtensionManager();
    }
}
