package by.itstep.J1022.victorgalkevich.model.comparators.comparatorsForNPCs;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.CharacterInGame;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.NonPlayerCharacter;

import java.util.Comparator;

public class DescendingRespawnDelayComparator extends ComparatorForNPC {
    private static DescendingRespawnDelayComparator comparator;

    private DescendingRespawnDelayComparator() {
    }

    @Override
    public int compare(CharacterInGame o1, CharacterInGame o2) {
        return ((NonPlayerCharacter) o2).getRespawnTimeSeconds() - ((NonPlayerCharacter) o1).getRespawnTimeSeconds();
    }

    public static DescendingRespawnDelayComparator getInstance() {
        if (null == comparator) {
            comparator = new DescendingRespawnDelayComparator();
        }
        return comparator;
    }
}
