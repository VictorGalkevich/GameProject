package by.itstep.J1022.victorgalkevich.model.logic;

import by.itstep.J1022.victorgalkevich.model.collections.AbstractCharacterList;
import by.itstep.J1022.victorgalkevich.model.comparators.defaultComparators.AscendingDamageComparator;
import by.itstep.J1022.victorgalkevich.model.comparators.defaultComparators.AscendingHealthPointsComparator;
import by.itstep.J1022.victorgalkevich.model.comparators.defaultComparators.AscendingMoveSpeedComparator;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.CharacterInGame;

public class CollectionSorter {
    private CollectionSorter() {
    }

    public static void sortAscendingDamage(AbstractCharacterList<CharacterInGame> list) {
        if(list != null && list.size() > 1){
            list.sort(AscendingDamageComparator.getInstance());
        }
    }

    public static void sortAscendingMoveSpeed(AbstractCharacterList<CharacterInGame> list) {
        if (list != null && list.size() > 1){
            list.sort(AscendingMoveSpeedComparator.getInstance());

        }
    }

    public static void sortAscendingHealthPoints(AbstractCharacterList<CharacterInGame> list) {
        if (list != null && list.size() > 1){
            list.sort(AscendingHealthPointsComparator.getInstance());
        }
    }
}
