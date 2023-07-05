package by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.npcs;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.NonPlayerCharacter;

public class WeakCreep extends NonPlayerCharacter {
    public WeakCreep() {
        this.damage = 10;
        this.moveSpeed = 310;
        this.healthPoints = 120;
        this.respawnTimeSeconds = 2;
    }

    public WeakCreep(WeakCreep hero) {
        super(hero);
    }

    public WeakCreep(int damage, int moveSpeed, int healthPoints, int respawnTimeSeconds) {
        super(damage, moveSpeed, healthPoints, respawnTimeSeconds);
    }

    @Override
    public String attack() {
        return "I'm fighting with a plastic sword!";
    }
}
