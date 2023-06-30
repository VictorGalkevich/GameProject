package by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.heroes;

import by.itstep.J1022.victorgalkevich.model.benahior.abstractLayer.FightWithSword;
import by.itstep.J1022.victorgalkevich.model.benahior.implementationLayer.FightWithIronSword;
import by.itstep.J1022.victorgalkevich.model.benahior.interfaceLayer.FightBehavior;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.PlayerCharacter;

public class MeleeHero extends PlayerCharacter {
    {
        this.healthPoints = 1250;
        this.moveSpeed = 300;
        this.behavior = new FightWithIronSword();
        this.damage = behavior.getDamage();
    }

    public MeleeHero() {
    }

    public MeleeHero(MeleeHero hero){
        super(hero);
    }

    @Override
    public void setBehavior(FightBehavior fightBehavior) {
        if (fightBehavior instanceof FightWithSword) {
            this.damage += behavior.getDamage();
            this.behavior = fightBehavior;
        }
    }

    @Override
    public String toString() {
        return "I'm a melee fighter. " + super.toString();
    }
}
