package by.itstep.J1022.victorgalkevich.model.comparators.defaultComparators;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.CharacterInGame;

import java.util.Comparator;

public class AscendingMoveSpeedComparator implements Comparator<CharacterInGame> {
    private static AscendingMoveSpeedComparator comparator;

    private AscendingMoveSpeedComparator(){}

    @Override
    public int compare(CharacterInGame o1, CharacterInGame o2) {
        return o1.getMoveSpeed() - o2.getMoveSpeed();
    }

    public static AscendingMoveSpeedComparator getInstance(){
        if(null == comparator){
            comparator = new AscendingMoveSpeedComparator();
        }
        return comparator;
    }
}
