package by.itstep.J1022.victorgalkevich.model.logic;

import by.itstep.J1022.victorgalkevich.model.collections.AbstractCharacterList;
import by.itstep.J1022.victorgalkevich.model.comparators.comparatorsForHeroes.AscendingNetWorthComparator;
import by.itstep.J1022.victorgalkevich.model.comparators.comparatorsForHeroes.DescendingNetWorthComparator;
import by.itstep.J1022.victorgalkevich.model.comparators.comparatorsForNPCs.AscendingRespawnDelayComparator;
import by.itstep.J1022.victorgalkevich.model.comparators.comparatorsForNPCs.DescendingRespawnDelayComparator;
import by.itstep.J1022.victorgalkevich.model.comparators.defaultComparators.AscendingDamageComparator;
import by.itstep.J1022.victorgalkevich.model.comparators.defaultComparators.AscendingHealthPointsComparator;
import by.itstep.J1022.victorgalkevich.model.comparators.defaultComparators.AscendingMoveSpeedComparator;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.CharacterInGame;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.NonPlayerCharacter;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.PlayerCharacter;

public class CollectionSorter {
    private CollectionSorter(){}

    public static void sortAscendingDamage(AbstractCharacterList<CharacterInGame> list){
        list.sort(AscendingDamageComparator.getInstance());
    }

    public static void sortAscendingMoveSpeed(AbstractCharacterList<CharacterInGame> list){
        list.sort(AscendingMoveSpeedComparator.getInstance());
    }

    public static void sortAscendingHealthPoints(AbstractCharacterList<CharacterInGame> list){
        list.sort(AscendingHealthPointsComparator.getInstance());
    }

    public static void sortAscendingNetWorth(AbstractCharacterList<PlayerCharacter> list){
        list.sort(AscendingNetWorthComparator.getInstance());
    }

    public static void sortDescendingNetWorth(AbstractCharacterList<PlayerCharacter> list){
        list.sort(DescendingNetWorthComparator.getInstance());
    }

    public static void sortDescendingRespawnTime(AbstractCharacterList<NonPlayerCharacter> list){
        list.sort(DescendingRespawnDelayComparator.getInstance());
    }

    public static void sortAscendingRespawnTime(AbstractCharacterList<NonPlayerCharacter> list){
        list.sort(AscendingRespawnDelayComparator.getInstance());
    }

}
