package by.itstep.J1022.victorgalkevich.view;

import by.itstep.J1022.victorgalkevich.model.collections.AbstractCharacterList;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.CharacterInGame;

public class UserInterface {
    private UserInterface(){}

    public static void show(CharacterInGame arg){
        System.out.println(arg);
    }

    public static <T extends CharacterInGame> void show(AbstractCharacterList<T> arg){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arg.size(); i++) {
            builder.append("Member number ").append(i + 1).append("\n").append(arg.get(i)).append("\n\n");
        }
        System.out.println(builder);
    }
}
