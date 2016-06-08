package examples.mockito;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyString;
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

    @Test
    public void Returns_ByDefault_WorksForHardCodedArgument2() {
        IFileNameRules fakeRules = mock(IFileNameRules.class);
        when(fakeRules.isValidLogFileName(anyString())).thenReturn(true);

        boolean result = fakeRules.isValidLogFileName("anything.txt");

        assertThat(result, is(true));
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void Returns_ArgAny_Throws() throws Exception{
        IFileNameRules fakeRules = mock(IFileNameRules.class);
        when(fakeRules.isValidLogFileName(anyString())).thenThrow(new Exception("fake exception"));

        thrown.expect(Exception.class);
        thrown.expectMessage("fake exception");
        fakeRules.isValidLogFileName("anything");
    }
}