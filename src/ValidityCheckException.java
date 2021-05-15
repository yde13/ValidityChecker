
public class ValidityCheckException extends Exception {

    private static final long serialVersionUID = 1L;
    private Error error;

    public ValidityCheckException(Error error) {
        this.error = error;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

}

