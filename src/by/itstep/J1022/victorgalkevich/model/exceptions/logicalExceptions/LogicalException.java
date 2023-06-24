package by.itstep.J1022.victorgalkevich.model.exceptions.logicalExceptions;

import by.itstep.J1022.victorgalkevich.model.exceptions.GameProjectException;

public class LogicalException extends GameProjectException {
    public LogicalException() {
        super();
    }

    public LogicalException(String message) {
        super(message);
    }

    public LogicalException(String message, Throwable cause) {
        super(message, cause);
    }

    public LogicalException(Throwable cause) {
        super(cause);
    }
}
