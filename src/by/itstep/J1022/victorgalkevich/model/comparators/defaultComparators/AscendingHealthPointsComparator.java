package by.itstep.J1022.victorgalkevich.model.comparators.defaultComparators;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.CharacterInGame;

import java.util.Comparator;

public class AscendingHealthPointsComparator implements Comparator<CharacterInGame> {
    private static AscendingHealthPointsComparator comparator;

    private AscendingHealthPointsComparator(){}

    @Override
    public int compare(CharacterInGame o1, CharacterInGame o2) {
        return o1.getHealthPoints() - o2.getHealthPoints();
    }

    public static AscendingHealthPointsComparator getInstance(){
        if(null == comparator){
            comparator = new AscendingHealthPointsComparator();
        }
        return comparator;
    }
}
