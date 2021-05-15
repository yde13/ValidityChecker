
public class ValidityCheckNull implements ValidityChecker {
    public boolean validate(String input) throws ValidityCheckException {
        try {
            if (isNull(input)) {
                throw new ValidityCheckException(Error.IS_NULL);
            }
            if (isEmpty(input)) {
                throw new ValidityCheckException(Error.IS_EMPTY);
            } else {
                return true;
            }
        } catch (ValidityCheckException e) {
            throw e;
        }
    }

    public boolean isNull(String input) {
        return input == null;
    }

    public boolean isEmpty(String input) {
        return input.trim().isEmpty();
    }
}