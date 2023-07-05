package by.itstep.J1022.victorgalkevich.model.exceptions.technicalExceptions.serializationExceptions;

public class CharacterSerializationException extends DataAccessLayerException {
    public CharacterSerializationException() {
        super();
    }

    public CharacterSerializationException(String message) {
        super(message);
    }

    public CharacterSerializationException(String message, Throwable cause) {
        super(message, cause);
    }

    public CharacterSerializationException(Throwable cause) {
        super(cause);
    }
}
