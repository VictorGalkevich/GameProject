package by.itstep.J1022.victorgalkevich.model.comparators.comparatorsForNPCs;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.CharacterInGame;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.NonPlayerCharacter;

import java.util.Comparator;

public class AscendingRespawnDelayComparator extends ComparatorForNPC {
    private static AscendingRespawnDelayComparator comparator;

    private AscendingRespawnDelayComparator() {
    }

    @Override
    public int compare(CharacterInGame o1, CharacterInGame o2) {
        return ((NonPlayerCharacter) o1).getRespawnTimeSeconds() - ((NonPlayerCharacter) o2).getRespawnTimeSeconds();
    }

    public static AscendingRespawnDelayComparator getInstance() {
        if (null == comparator) {
            comparator = new AscendingRespawnDelayComparator();
        }
        return comparator;
    }
}
