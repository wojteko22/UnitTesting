package examples.szwy;

/**
 * @author Dawid on 2016-06-08.
 */
public class TestVirtual extends VirtualMethods {
    private IExtensionManager manager;
    public TestVirtual(IExtensionManager manager){
        this.manager=manager;
    }
    @Override
    protected IExtensionManager getManager(){
        return manager;
    }
}
