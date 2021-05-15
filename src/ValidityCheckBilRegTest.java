import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidityCheckBilRegTest {

    private ValidityChecker validityChecker = new ValidityCheckBilReg();

    @Before
    public void init() {
        validityChecker = new ValidityCheckBilReg();
    }

    @Test
    public void validRegistrationNumberTest() throws ValidityCheckException {
        String validInput = "YOT929";

        boolean isValid = validityChecker.validate(validInput);

        assertTrue(isValid);
    }

    @Test
    public void invalidRegistrationNumberThrowsExceptionTest() throws ValidityCheckException {
        String invalidInput = "YOT9299";

        Assertions.assertThrows(ValidityCheckException.class, () -> {
            validityChecker.validate(invalidInput);
        });


    }

}