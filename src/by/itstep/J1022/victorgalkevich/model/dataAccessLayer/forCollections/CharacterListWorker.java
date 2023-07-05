package by.itstep.J1022.victorgalkevich.model.dataAccessLayer.forCollections;

import by.itstep.J1022.victorgalkevich.model.collections.CharacterList;
import by.itstep.J1022.victorgalkevich.model.exceptions.technicalExceptions.serializationExceptions.CollectionDeserializationException;
import by.itstep.J1022.victorgalkevich.model.exceptions.technicalExceptions.serializationExceptions.CollectionSerializationException;

import java.io.*;

public class CharacterListWorker {
    private CharacterListWorker() {
    }

    public static void serialize(String filePath, CharacterList list) throws CollectionSerializationException {
        try (final ObjectOutputStream ObjectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            ObjectOutputStream.writeObject(list);
        } catch (final IOException io) {
            throw new CollectionSerializationException("Something went wrong in serialization block!");
        }
    }

    public static CharacterList deserialize(String filePath) throws CollectionDeserializationException {
        CharacterList list = null;
        try (final ObjectInputStream ObjectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            list = (CharacterList) ObjectInputStream.readObject();
        } catch (final IOException | ClassNotFoundException | ClassCastException ex) {
            throw new CollectionDeserializationException("Something went wrong in deserialization block!");
        }
        return list;
    }
}
