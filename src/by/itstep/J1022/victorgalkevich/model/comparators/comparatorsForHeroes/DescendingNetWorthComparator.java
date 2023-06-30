package by.itstep.J1022.victorgalkevich.model.comparators.comparatorsForHeroes;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.CharacterInGame;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.PlayerCharacter;

public class DescendingNetWorthComparator extends ComparatorForHeroes {
    private static DescendingNetWorthComparator comparator;

    private DescendingNetWorthComparator() {
    }

    @Override
    public int compare(CharacterInGame o1, CharacterInGame o2) {
        return (((PlayerCharacter) o2).getNetWorth() - ((PlayerCharacter) o1).getNetWorth());
    }

    public static DescendingNetWorthComparator getInstance() {
        if (null == comparator) {
            comparator = new DescendingNetWorthComparator();
        }
        return comparator;
    }
}
