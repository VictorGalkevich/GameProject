package by.itstep.J1022.victorgalkevich.model.DataAccessLayer.forEntities;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.CharacterInGame;

import java.io.*;

public class CharacterWorker {
    private CharacterWorker() {
    }

    public static void serialize(String filePath, CharacterInGame character) {
        try (final ObjectOutputStream ObjectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            ObjectOutputStream.writeObject(character);
        } catch (final IOException io) {
            System.out.println(io.getMessage());
        }
    }

    public static CharacterInGame deserialize(String filePath) {
        CharacterInGame character = null;
        try (final ObjectInputStream ObjectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            character = (CharacterInGame) ObjectInputStream.readObject();
        } catch (final IOException | ClassNotFoundException | ClassCastException ex) {
            System.out.println(ex.getMessage());
        }
        return character;
    }
}
