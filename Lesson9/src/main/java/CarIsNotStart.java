public class CarIsNotStart extends Exception {
    public CarIsNotStart() {
    }

    public CarIsNotStart(String message) {
        super(message);
    }

    public CarIsNotStart(String message, Throwable cause) {
        super(message, cause);
    }

    public CarIsNotStart(Throwable cause) {
        super(cause);
    }

    public CarIsNotStart(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}