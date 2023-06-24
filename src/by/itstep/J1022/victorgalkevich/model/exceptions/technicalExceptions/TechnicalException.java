package by.itstep.J1022.victorgalkevich.model.exceptions.technicalExceptions;

import by.itstep.J1022.victorgalkevich.model.exceptions.GameProjectException;

public class TechnicalException extends GameProjectException {
    public TechnicalException() {
        super();
    }

    public TechnicalException(String message) {
        super(message);
    }

    public TechnicalException(String message, Throwable cause) {
        super(message, cause);
    }

    public TechnicalException(Throwable cause) {
        super(cause);
    }
}
