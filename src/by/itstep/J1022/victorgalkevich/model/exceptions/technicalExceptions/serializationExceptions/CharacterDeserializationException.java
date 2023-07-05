package by.itstep.J1022.victorgalkevich.model.exceptions.technicalExceptions.serializationExceptions;

public class CharacterDeserializationException extends DataAccessLayerException {
    public CharacterDeserializationException() {
        super();
    }

    public CharacterDeserializationException(String message) {
        super(message);
    }

    public CharacterDeserializationException(String message, Throwable cause) {
        super(message, cause);
    }

    public CharacterDeserializationException(Throwable cause) {
        super(cause);
    }
}
