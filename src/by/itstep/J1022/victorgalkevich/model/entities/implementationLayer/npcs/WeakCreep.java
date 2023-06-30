package by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.npcs;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.NonPlayerCharacter;

public class WeakCreep extends NonPlayerCharacter {
    {
        this.damage = 10;
        this.moveSpeed = 310;
        this.healthPoints = 120;
        this.respawnTimeSeconds = 2;
    }

    public WeakCreep() {
    }

    public WeakCreep(WeakCreep hero) {
        super(hero);
    }

    @Override
    public String attack() {
        return "I'm fighting with a plastic sword!";
    }
}
