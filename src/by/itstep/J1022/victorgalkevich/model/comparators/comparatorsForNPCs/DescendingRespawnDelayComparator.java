package by.itstep.J1022.victorgalkevich.model.comparators.comparatorsForNPCs;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.NonPlayerCharacter;

import java.util.Comparator;

public class DescendingRespawnDelayComparator extends ComparatorForNPC {
    private static DescendingRespawnDelayComparator comparator;

    private DescendingRespawnDelayComparator(){}

    @Override
    public int compare(NonPlayerCharacter o1, NonPlayerCharacter o2) {
        return o2.getRespawnTimeSeconds() - o1.getRespawnTimeSeconds();
    }

    public static DescendingRespawnDelayComparator getInstance(){
        if(null == comparator){
            comparator = new DescendingRespawnDelayComparator();
        }
        return comparator;
    }
}
