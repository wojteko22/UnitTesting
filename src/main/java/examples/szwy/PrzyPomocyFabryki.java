package examples.szwy;

/**
 * @author Dawid on 2016-06-08.
 */
public class PrzyPomocyFabryki {
    private IExtensionManager menager;

    public PrzyPomocyFabryki(){
        menager=FactoryClass.create();
    }

    public boolean isValidLogFileName(String fileName){
        return menager.isValid(fileName);
    }
}
