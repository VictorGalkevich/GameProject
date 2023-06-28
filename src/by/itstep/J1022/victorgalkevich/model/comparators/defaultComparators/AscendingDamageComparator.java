package by.itstep.J1022.victorgalkevich.model.comparators.defaultComparators;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.CharacterInGame;

import java.util.Comparator;

public class AscendingDamageComparator implements Comparator<CharacterInGame> {
    private static AscendingDamageComparator comparator;

    private AscendingDamageComparator() {
    }

    @Override
    public int compare(CharacterInGame o1, CharacterInGame o2) {
        return o1.getDamage() - o2.getDamage();
    }

    public static AscendingDamageComparator getInstance() {
        if (null == comparator) {
            comparator = new AscendingDamageComparator();
        }
        return comparator;
    }
}
