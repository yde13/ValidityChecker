import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidityCheckNullTest {

    private ValidityCheckNull validityChecker = new ValidityCheckNull();

    @Before
    public void init() {
        validityChecker = new ValidityCheckNull();
    }

    @Test
    public void isNullTest() throws ValidityCheckException {
        String nullInput = null;

        boolean isNull = validityChecker.isNull(nullInput);
        assertTrue(isNull);

    }

    @Test
    public void isEmptyTest() throws ValidityCheckException {
        String emptyInput = "";

        boolean isEmpty = validityChecker.isEmpty(emptyInput);
        assertTrue(isEmpty);
    }

}