package by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.strengtheners;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.NonPlayerCharacter;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.StrengthenerForNPC;

public class SuperSlow extends StrengthenerForNPC {
    public SuperSlow(NonPlayerCharacter nonPlayerCharacter) {
        this.npc = nonPlayerCharacter;
        this.damage = npc.getDamage();
        this.healthPoints = npc.getHealthPoints();
        this.moveSpeed = 5;
        this.respawnTimeSeconds = npc.getRespawnTimeSeconds();
    }
}
