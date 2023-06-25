package by.itstep.J1022.victorgalkevich.model.collections;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.CharacterInGame;


public abstract class AbstractCharacterList<T extends CharacterInGame> implements Iterable<T>{
    public abstract void add(T character);

    public abstract int size();

    public abstract T get(int index);

    public abstract void set(int index, T character);

    public boolean isEmpty(){
        return size() == 0;
    }

    public abstract void clear();

    public abstract void remove(int index);
}
