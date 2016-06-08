package examples.mockito;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Wojciech Okoński
 *         created on 08.06.2016 r.
 */
public class IFileNameRulesTest {
    @Test
    public void Returns_ByDefault_WorksForHardCodedArgument() {
        IFileNameRules fakeRules = mock(IFileNameRules.class);
        when(fakeRules.isValidLogFileName("strict.txt")).thenReturn(true);

        boolean result = fakeRules.isValidLogFileName("strict.txt");

        assertThat(result, is(true));
    }
}