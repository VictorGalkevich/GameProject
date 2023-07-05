package by.itstep.J1022.victorgalkevich.model.exceptions.technicalExceptions.serializationExceptions;

import by.itstep.J1022.victorgalkevich.model.exceptions.technicalExceptions.TechnicalException;

public class DataAccessLayerException extends TechnicalException {
    public DataAccessLayerException() {
        super();
    }

    public DataAccessLayerException(String message) {
        super(message);
    }

    public DataAccessLayerException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataAccessLayerException(Throwable cause) {
        super(cause);
    }
}
