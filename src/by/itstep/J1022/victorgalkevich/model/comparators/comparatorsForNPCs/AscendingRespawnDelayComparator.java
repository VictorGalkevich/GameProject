package by.itstep.J1022.victorgalkevich.model.comparators.comparatorsForNPCs;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.NonPlayerCharacter;

import java.util.Comparator;

public class AscendingRespawnDelayComparator extends ComparatorForNPC {
    private static AscendingRespawnDelayComparator comparator;

    private AscendingRespawnDelayComparator(){}

    @Override
    public int compare(NonPlayerCharacter o1, NonPlayerCharacter o2) {
        return o1.getRespawnTimeSeconds() - o2.getRespawnTimeSeconds();
    }

    public static AscendingRespawnDelayComparator getInstance(){
        if(null == comparator){
            comparator = new AscendingRespawnDelayComparator();
        }
        return comparator;
    }
}
