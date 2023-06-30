package by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.npcs;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.NonPlayerCharacter;

public class PurpleMonster extends NonPlayerCharacter {
    {
        this.damage = 30;
        this.moveSpeed = 330;
        this.healthPoints = 300;
        this.respawnTimeSeconds = 5;
    }

    public PurpleMonster() {
    }

    public PurpleMonster(PurpleMonster hero) {
        super(hero);
    }

    @Override
    public String attack() {
        return "I'm fighting with big purple legs!";
    }
}
