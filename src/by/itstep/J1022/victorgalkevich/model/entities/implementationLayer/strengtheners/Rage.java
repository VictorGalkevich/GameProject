package by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.strengtheners;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.NonPlayerCharacter;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.StrengthenerForNPC;

public class Rage extends StrengthenerForNPC {
    public Rage(NonPlayerCharacter nonPlayerCharacter) {
        this.npc = nonPlayerCharacter;
        this.damage = 2 * npc.getDamage();
        this.healthPoints = npc.getHealthPoints();
        this.moveSpeed = 50 + npc.getMoveSpeed();
        this.respawnTimeSeconds = npc.getRespawnTimeSeconds();
    }
}
