package by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.strengtheners;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.NonPlayerCharacter;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.StrengthenerForNPC;

public class LevelUP extends StrengthenerForNPC {
    public LevelUP(NonPlayerCharacter nonPlayerCharacter){
        this.npc = nonPlayerCharacter;
        this.damage = (int) (1.2 * npc.getDamage());
        this.healthPoints = (int) (1.2 * npc.getHealthPoints());
        this.moveSpeed = 5 + npc.getMoveSpeed();
        this.respawnTimeSeconds = npc.getRespawnTimeSeconds();
    }
}
