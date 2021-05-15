import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidityCheckPersonnummerTest {

    private ValidityCheckPersonnummer validityChecker = new ValidityCheckPersonnummer();

    @Before
    public void init() {
        validityChecker = new ValidityCheckPersonnummer();
    }

    @Test
    public void removeTwoFirstTest() throws ValidityCheckException {
        String input = "199806056464";

        String valid = validityChecker.removeTwoFirst(input);

        assertEquals("9806056464", valid);
    }

    @Test
    public void removeDashTest() throws ValidityCheckException {
        String input = "19980605-6464";

        String valid = validityChecker.removeDash(input);

        assertEquals("199806056464", valid);
    }

    @Test
    public void removeSpaceTest() throws ValidityCheckException {
        String input = "19980605 6464";

        String valid = validityChecker.removeSpace(input);

        assertEquals("199806056464", valid);
    }

    @Test
    public void validPersonnummerTest() throws ValidityCheckException {
        String input = "8112189876";

        boolean valid = validityChecker.isPersonnummer(input);

        assertTrue(valid);
    }

    @Test
    public void invalidPersonnummerTest() throws ValidityCheckException {
        String input = "8112189878";

        boolean valid = validityChecker.isPersonnummer(input);

        assertFalse(valid);
    }

    @Test
    public void invalidPersonnummerThrowsExceptionTest() throws ValidityCheckException {
        String input = "8112189878 f55";

        Assertions.assertThrows(ValidityCheckException.class, () -> {
            validityChecker.validate(input);
        });
    }

}