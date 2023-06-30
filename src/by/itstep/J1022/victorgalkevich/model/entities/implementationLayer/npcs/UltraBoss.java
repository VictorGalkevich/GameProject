package by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.npcs;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.NonPlayerCharacter;

public class UltraBoss extends NonPlayerCharacter {
    {
        this.healthPoints = 5000;
        this.moveSpeed = 120;
        this.damage = 230;
        this.respawnTimeSeconds = 180;
    }

    public UltraBoss() {
    }

    public UltraBoss(UltraBoss hero) {
        super(hero);
    }

    @Override
    public String attack() {
        return "I'm shooting with my lasers!";
    }
}
