package by.itstep.J1022.victorgalkevich.model.comparators.comparatorsForHeroes;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.PlayerCharacter;

public class DescendingNetWorthComparator extends ComparatorForHeroes {
    private static DescendingNetWorthComparator comparator;

    private DescendingNetWorthComparator() {
    }

    @Override
    public int compare(PlayerCharacter o1, PlayerCharacter o2) {
        return o2.getNetWorth() - o1.getNetWorth();
    }

    public static DescendingNetWorthComparator getInstance() {
        if (null == comparator) {
            comparator = new DescendingNetWorthComparator();
        }
        return comparator;
    }
}
