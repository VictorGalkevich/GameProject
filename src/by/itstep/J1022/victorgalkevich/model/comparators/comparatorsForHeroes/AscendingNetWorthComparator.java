package by.itstep.J1022.victorgalkevich.model.comparators.comparatorsForHeroes;

import by.itstep.J1022.victorgalkevich.model.comparators.comparatorsForNPCs.AscendingRespawnDelayComparator;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.NonPlayerCharacter;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.PlayerCharacter;

public class AscendingNetWorthComparator extends ComparatorForHeroes {
    private static AscendingNetWorthComparator comparator;

    private AscendingNetWorthComparator() {
    }

    @Override
    public int compare(PlayerCharacter o1, PlayerCharacter o2) {
        return o1.getNetWorth() - o2.getNetWorth();
    }

    public static AscendingNetWorthComparator getInstance() {
        if (null == comparator) {
            comparator = new AscendingNetWorthComparator();
        }
        return comparator;
    }
}
