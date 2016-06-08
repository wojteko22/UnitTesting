package examples.seams;

import java.util.Random;

/**
 * @author Dawid on 2016-06-08.
 */
public class FileExtensionManager implements IExtensionManager {
    @Override
    public boolean isValid(String fileName) {
        // Sprawdza na podstawie jakiegos zewnetrznego pliku poprawnosc,
        // wiec nie wiemy co zwroci nam ta metoda
        return new Random().nextBoolean();
    }
}