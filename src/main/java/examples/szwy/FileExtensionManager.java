package examples.szwy;

import java.util.Random;

/**
 * Created by Dawid on 2016-06-08.
 */
public class FileExtensionManager implements IExtensionManager {
    @Override
    public boolean isValid(String fileName) {
        // Sprawdza na podstawie jakigos zewnetrznego pliku poprawnosc
        // wiec nie wiemy co zwroci nam ta metoda
        return new Random().nextBoolean();
    }
}
