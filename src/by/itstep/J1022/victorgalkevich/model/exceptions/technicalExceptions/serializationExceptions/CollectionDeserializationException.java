package by.itstep.J1022.victorgalkevich.model.exceptions.technicalExceptions.serializationExceptions;

public class CollectionDeserializationException extends DataAccessLayerException {
    public CollectionDeserializationException() {
        super();
    }

    public CollectionDeserializationException(String message) {
        super(message);
    }

    public CollectionDeserializationException(String message, Throwable cause) {
        super(message, cause);
    }

    public CollectionDeserializationException(Throwable cause) {
        super(cause);
    }
}
