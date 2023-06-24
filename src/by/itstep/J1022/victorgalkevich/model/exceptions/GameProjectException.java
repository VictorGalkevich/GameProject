package by.itstep.J1022.victorgalkevich.model.exceptions;

public class GameProjectException extends Throwable{
    public GameProjectException() {
        super();
    }

    public GameProjectException(String message) {
        super(message);
    }

    public GameProjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public GameProjectException(Throwable cause) {
        super(cause);
    }
}
