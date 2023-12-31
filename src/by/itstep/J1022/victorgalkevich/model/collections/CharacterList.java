package by.itstep.J1022.victorgalkevich.model.collections;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.CharacterInGame;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

public class CharacterList<T extends CharacterInGame> extends AbstractCharacterList<T> {
    private CharacterInGame[] list;

    private int size;

    private int lastIndex;

    {
        this.size = 0;
        this.list = new CharacterInGame[size];
    }

    public CharacterList() {
    }

    public CharacterList(int size) {
        this.size = size;
        this.list = new CharacterInGame[size];
    }

    {
        lastIndex = -1;
    }

    @Override
    public void add(T character) {
        lastIndex++;
        if (lastIndex == size) {
            size++;
            CharacterInGame[] newList = new CharacterInGame[size];
            if (size - 1 >= 0) {
                System.arraycopy(list, 0, newList, 0, size - 1);
            }
            newList[lastIndex] = character;
            this.list = newList;
        } else {
            list[lastIndex] = character;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) list[index];
    }

    @Override
    public void set(int index, T character) {
        Objects.checkIndex(index, size);
        list[index] = character;
    }

    @Override
    public void clear() {
        this.size = 0;
        list = new CharacterInGame[size];
    }

    @Override
    public void remove(int index) {
        Objects.checkIndex(index, size);
        size--;
        CharacterInGame[] newList = new CharacterInGame[size];
        if (index >= 0) {
            System.arraycopy(list, 0, newList, 0, index);
        }
        if (size - index >= 0) {
            System.arraycopy(list, index + 1, newList, index, size - index);
        }
        this.list = newList;
    }

    @Override
    public void sort() {
        Arrays.sort(this.list);
    }

    @Override
    public void sort(Comparator<T> comparator) {
        Arrays.sort((T[]) this.list, comparator);
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new InvisibleIterator();
    }

    private class InvisibleIterator implements Iterator<T> {
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            InvisibleIterator that = (InvisibleIterator) o;
            return count == that.count;
        }

        @Override
        public int hashCode() {
            return Objects.hash(count);
        }

        private int count = 0;

        @Override
        public boolean hasNext() {
            return count < list.length;
        }

        @Override
        public T next() {
            return (T) list[count++];
        }
    }
}
