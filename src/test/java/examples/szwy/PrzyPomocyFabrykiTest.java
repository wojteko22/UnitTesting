package examples.szwy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Dawid on 2016-06-08.
 */
public class PrzyPomocyFabrykiTest {

    @Test
    public void testIsValidLogFileName_SupportedEstension_ReturnsTrue() throws Exception {
        FakeExtensionManager manager=new FakeExtensionManager();
        manager.WillBeValid=true;
        assertTrue(manager.isValid("obojetnieCo.sdf"));
        FactoryClass.setManager(manager);
        PrzyPomocyFabryki log=new PrzyPomocyFabryki();
        assertTrue(log.isValidLogFileName("dafkl.fad"));
    }
}