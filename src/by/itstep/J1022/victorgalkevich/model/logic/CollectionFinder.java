package by.itstep.J1022.victorgalkevich.model.logic;

import by.itstep.J1022.victorgalkevich.model.collections.AbstractCharacterList;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.CharacterInGame;
import java.util.*;

public class CollectionFinder {
    private CollectionFinder() {
    }

    public static <T extends CharacterInGame & Comparable<CharacterInGame>> T min(AbstractCharacterList<? extends T> coll) {
        if(coll == null || coll.isEmpty()){
            return null;
        }
        Iterator<? extends T> i = coll.iterator();
        T candidate = i.next();

        while (i.hasNext()) {
            T next = i.next();
            if (next.compareTo(candidate) < 0)
                candidate = next;
        }
        return candidate;
    }

    public static <T extends CharacterInGame & Comparable<CharacterInGame>> T min(AbstractCharacterList<? extends T> coll, Comparator<? super T> comp) {
        if(coll == null || coll.isEmpty()){
            return null;
        }
        if (comp == null)
            return (T) min(coll);

        Iterator<? extends T> i = coll.iterator();
        T candidate = i.next();

        while (i.hasNext()) {
            T next = i.next();
            if (comp.compare(next, candidate) < 0)
                candidate = next;
        }
        return candidate;
    }

    public static <T extends CharacterInGame & Comparable<CharacterInGame>> T max(AbstractCharacterList<? extends T> coll) {
        if(coll == null || coll.isEmpty()){
            return null;
        }
        Iterator<? extends T> i = coll.iterator();
        T candidate = i.next();

        while (i.hasNext()) {
            T next = i.next();
            if (next.compareTo(candidate) > 0)
                candidate = next;
        }
        return candidate;
    }

    public static <T extends CharacterInGame & Comparable<CharacterInGame>> T max(AbstractCharacterList<? extends T> coll, Comparator<? super T> comp) {
        if(coll == null || coll.isEmpty()){
            return null;
        }
        if (comp == null)
            return (T) max(coll);

        Iterator<? extends T> i = coll.iterator();
        T candidate = i.next();

        while (i.hasNext()) {
            T next = i.next();
            if (comp.compare(next, candidate) > 0)
                candidate = next;
        }
        return candidate;
    }

    public static <T> int linearSearch(AbstractCharacterList<? extends Comparable<? super T>> list, T item) {
        if(list == null || list.isEmpty()){
            return -2;
        }
        for (int i = 0; i < list.size(); i++) {
            if (item != null && item.equals(list.get(i))){
                return i;
            } else if (item == null && item == list.get(i)) {
                return i;
            }
        }
        return -1;
    }
}
