package by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.heroes;

import by.itstep.J1022.victorgalkevich.model.benahior.abstractLayer.FightWithBow;
import by.itstep.J1022.victorgalkevich.model.benahior.implementationLayer.FightWithOakBow;
import by.itstep.J1022.victorgalkevich.model.benahior.interfaceLayer.FightBehavior;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.PlayerCharacter;

public class ArcherHero extends PlayerCharacter {
    {
        this.healthPoints = 900;
        this.moveSpeed = 315;
        this.behavior = new FightWithOakBow();
        this.damage = behavior.getDamage();
    }

    public ArcherHero() {
    }

    public ArcherHero(ArcherHero hero){
        super(hero);
    }

    @Override
    public void setBehavior(FightBehavior fightBehavior) {
        if (fightBehavior instanceof FightWithBow) {
            this.damage = behavior.getDamage();
            this.behavior = fightBehavior;
        }
    }

    @Override
    public String toString() {
        return "I'm an archer. " + super.toString();
    }
}
