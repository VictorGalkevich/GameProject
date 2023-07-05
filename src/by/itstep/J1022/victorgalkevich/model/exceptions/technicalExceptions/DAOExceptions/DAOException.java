package by.itstep.J1022.victorgalkevich.model.exceptions.technicalExceptions.DAOExceptions;

import by.itstep.J1022.victorgalkevich.model.exceptions.technicalExceptions.TechnicalException;

public class DAOException extends TechnicalException {
    public DAOException() {
        super();
    }

    public DAOException(String message) {
        super(message);
    }

    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOException(Throwable cause) {
        super(cause);
    }
}
