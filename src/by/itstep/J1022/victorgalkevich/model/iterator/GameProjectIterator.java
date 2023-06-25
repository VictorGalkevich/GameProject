package by.itstep.J1022.victorgalkevich.model.iterator;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.CharacterInGame;

public interface GameProjectIterator {
    CharacterInGame element();
    boolean hasNextElement();
}
