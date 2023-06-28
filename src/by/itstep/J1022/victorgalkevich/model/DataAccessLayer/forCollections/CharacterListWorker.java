package by.itstep.J1022.victorgalkevich.model.DataAccessLayer.forCollections;

import by.itstep.J1022.victorgalkevich.model.collections.CharacterList;

import java.io.*;

public class CharacterListWorker {
    private CharacterListWorker() {
    }

    public static void serialize(String filePath, CharacterList list) {
        try (final ObjectOutputStream ObjectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            ObjectOutputStream.writeObject(list);
        } catch (final IOException io) {
            System.out.println(io.getMessage());
        }
    }

    public static CharacterList deserialize(String filePath) {
        CharacterList list = null;
        try (final ObjectInputStream ObjectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            list = (CharacterList) ObjectInputStream.readObject();
        } catch (final IOException | ClassNotFoundException | ClassCastException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }
}
