package examples.szwy;

/**
 * Created by Dawid on 2016-06-08.
 */
public class Seter_Geter {
    private IExtensionManager menager;

    public Seter_Geter(){
        menager=new FileExtensionManager();
    }

    public boolean isValidLogFileName(String fileName){
        return menager.isValid(fileName);
    }

    public IExtensionManager getMenager() {
        return menager;
    }

    public void setMenager(IExtensionManager menager) {
        this.menager = menager;
    }
}
