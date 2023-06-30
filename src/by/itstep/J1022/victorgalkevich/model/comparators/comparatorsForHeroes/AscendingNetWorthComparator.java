package by.itstep.J1022.victorgalkevich.model.comparators.comparatorsForHeroes;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.CharacterInGame;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.PlayerCharacter;

import java.util.Comparator;

public class AscendingNetWorthComparator extends ComparatorForHeroes {
    private static AscendingNetWorthComparator comparator;

    private AscendingNetWorthComparator() {
    }

    @Override
    public int compare(CharacterInGame o1, CharacterInGame o2) {
        return(((PlayerCharacter) o1).getNetWorth() - ((PlayerCharacter) o2).getNetWorth());
    }

    public static Comparator<CharacterInGame> getInstance() {
        if (null == comparator) {
            comparator = new AscendingNetWorthComparator();
        }
        return comparator;
    }
}
