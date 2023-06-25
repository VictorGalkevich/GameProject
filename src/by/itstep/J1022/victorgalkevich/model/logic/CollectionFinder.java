package by.itstep.J1022.victorgalkevich.model.logic;

import by.itstep.J1022.victorgalkevich.model.collections.AbstractCharacterList;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.CharacterInGame;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.PlayerCharacter;

public class CollectionFinder {
    private CollectionFinder(){}

    public static PlayerCharacter findMaxNetWorth(AbstractCharacterList<CharacterInGame> collection){
        int max = 1000; //1000 - the least Net worth for each player character
        CharacterInGame resultHero = null;
        for (CharacterInGame character : collection) {
            if(character instanceof PlayerCharacter && ((PlayerCharacter) character).getNetWorth() > max){
                max = ((PlayerCharacter) character).getNetWorth();
                resultHero = character;
            }
        }
        return (PlayerCharacter) resultHero;
    }

    public static PlayerCharacter findMinNetWorth(AbstractCharacterList<CharacterInGame> collection){
        int min = Integer.MAX_VALUE; //Integer.MAX_VALUE - the highest Net worth for each player character
        CharacterInGame resultHero = null;
        for (CharacterInGame character : collection) {
            if(character instanceof PlayerCharacter && ((PlayerCharacter) character).getNetWorth() < min){
                min = ((PlayerCharacter) character).getNetWorth();
                resultHero = character;
            }
        }
        return (PlayerCharacter) resultHero;
    }
}
