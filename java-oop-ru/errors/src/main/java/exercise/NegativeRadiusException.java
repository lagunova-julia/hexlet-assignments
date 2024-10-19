package exercise;

// BEGIN
public class NegativeRadiusException extends Exception {
    public String message;

    public NegativeRadiusException(String message) {
        this.message = message;
    }

    public NegativeRadiusException() {

    }
}
// END
