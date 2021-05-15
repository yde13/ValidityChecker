
public class ValidityCheckPersonnummer implements ValidityChecker {
    public boolean validate(String input) throws ValidityCheckException {
        try {
            if (input.contains("-")) {
                input = removeDash(input);
            }
            if (input.contains(" ")) {
                input = removeSpace(input);
            }
            if (input.length() == 12) {
                input = removeTwoFirst(input);
            }
            if (input.length() == 10) {
                return isPersonnummer(input);
            } else {
                throw new ValidityCheckException(Error.IS_NOT_PERSONNUMMER);
            }
        } catch (ValidityCheckException e) {
            throw e;
        }
    }

    public String removeTwoFirst(String input) {
        input = input.substring(2);
        return input;
    }

    public String removeDash(String input) {
        input = input.replace("-", "");
        return input;
    }

    public String removeSpace(String input) {
        input = input.replace(" ", "");
        return input;

    }

    public boolean isPersonnummer(String input) {
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            if ((i % 2) == 0) {
                char s = input.charAt(i);
                int num = Integer.parseInt(String.valueOf(s));
                int odd = num * 2;
                String k = String.valueOf(odd);

                if (odd > 9 && odd < 100) {
                    for (int j = 0; j < k.length(); j++) {
                        int l = Character.digit(k.charAt(j), 10);
                        sum += l;
                    }
                } else {
                    sum += odd;
                }

            } else {
                char s = input.charAt(i);
                int num = Integer.parseInt(String.valueOf(s));
                int even = num;
                sum += even;
            }
        }
        if(sum % 10 != 0) {
            System.out.println("Not a valid personal number");
            return false;
        } else {
            return true;
        }

    }

}
