package by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.strengtheners;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.NonPlayerCharacter;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.StrengthenerForNPC;

public class Disarm extends StrengthenerForNPC {
    public Disarm(NonPlayerCharacter nonPlayerCharacter) {
        this.npc = nonPlayerCharacter;
        this.damage = 0;
        this.healthPoints = npc.getHealthPoints();
        this.moveSpeed = npc.getMoveSpeed();
        this.respawnTimeSeconds = npc.getRespawnTimeSeconds();
    }
}
