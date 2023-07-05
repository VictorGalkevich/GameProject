package by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.npcs;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.NonPlayerCharacter;

public class AncientWizard extends NonPlayerCharacter {
    public AncientWizard() {
        this.healthPoints = 200;
        this.moveSpeed = 100;
        this.damage = 50;
        this.respawnTimeSeconds = 10;
    }

    public AncientWizard(AncientWizard hero) {
        super(hero);
    }

    public AncientWizard(int damage, int moveSpeed, int healthPoints, int respawnTimeSeconds) {
        super(damage, moveSpeed, healthPoints, respawnTimeSeconds);
    }

    @Override
    public String attack() {
        return "I'm fighting with my magic staff";
    }
}
