package by.itstep.J1022.victorgalkevich.model.exceptions.technicalExceptions.serializationExceptions;

public class CollectionSerializationException extends DataAccessLayerException {
    public CollectionSerializationException() {
        super();
    }

    public CollectionSerializationException(String message) {
        super(message);
    }

    public CollectionSerializationException(String message, Throwable cause) {
        super(message, cause);
    }

    public CollectionSerializationException(Throwable cause) {
        super(cause);
    }
}
