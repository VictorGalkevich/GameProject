package by.itstep.J1022.victorgalkevich.model.dataAccessLayer.forEntities;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.CharacterInGame;
import by.itstep.J1022.victorgalkevich.model.exceptions.technicalExceptions.serializationExceptions.CharacterDeserializationException;
import by.itstep.J1022.victorgalkevich.model.exceptions.technicalExceptions.serializationExceptions.CharacterSerializationException;

import java.io.*;

public class CharacterWorker {
    private CharacterWorker() {
    }

    public static void serialize(String filePath, CharacterInGame character) throws CharacterSerializationException {
        try (final ObjectOutputStream ObjectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            ObjectOutputStream.writeObject(character);
        } catch (final IOException io) {
            throw new CharacterSerializationException("Something went wrong in serialization block!");
        }
    }

    public static CharacterInGame deserialize(String filePath) throws CharacterDeserializationException {
        CharacterInGame character = null;
        try (final ObjectInputStream ObjectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            character = (CharacterInGame) ObjectInputStream.readObject();
        } catch (final IOException | ClassNotFoundException | ClassCastException ex) {
            throw new CharacterDeserializationException("Something went wrong in deserialization block!");
        }
        return character;
    }
}
