
public class ValidityCheckBilReg implements ValidityChecker {
    public boolean validate(String input) throws ValidityCheckException {
        try {
            if (isLowerCase(input)) {
                input = input.toUpperCase();
            }
            if(input.matches("(^[A-Z]{3})?(\\d{3})+") || input.matches("(^[A-Z]{3})?(\\d{2})?([A-Z]{1}$)+")) {
                return true;
            } else {
                throw new ValidityCheckException(Error.IS_NOT_BILREG);
            }
        } catch (ValidityCheckException e) {
            throw e;
        }
    }

    public boolean isLowerCase(String input) {
        char[] charArray = input.toCharArray();
        for(int i = 0; i < charArray.length; i++) {
            if(Character.isLowerCase(charArray[i])) {
                return true;
            }
        }
        return false;
    }

}
