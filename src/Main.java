
public class Main {
    public static void main(String[] args) throws Exception {
        try {
            String input = "9806054459";
            String bilReg = "YOt92c";

            ValidityChecker ValidityCheckNull = new ValidityCheckNull();
            ValidityChecker ValidityCheckPersonnummer = new ValidityCheckPersonnummer();
            ValidityChecker ValidityCheckBilReg = new ValidityCheckBilReg();

            if(ValidityCheckNull.validate(input)) {
                System.out.println("Input is not null or empty");
            }

            if(ValidityCheckPersonnummer.validate(input)){
                System.out.println("Valid personal number");
            }

            if(ValidityCheckBilReg.validate(bilReg)) {
                System.out.println("Valid car registration number");
            }

        } catch (ValidityCheckException e) {
            System.out.println(e.getError().name());
            throw e;
        }
    }

}