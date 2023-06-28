package by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.heroes;

import by.itstep.J1022.victorgalkevich.model.benahior.abstractLayer.FightWithSummons;
import by.itstep.J1022.victorgalkevich.model.benahior.implementationLayer.FightWithBears;
import by.itstep.J1022.victorgalkevich.model.benahior.interfaceLayer.FightBehavior;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.PlayerCharacter;

public class SummonerHero extends PlayerCharacter {
    {
        this.healthPoints = 1050;
        this.moveSpeed = 305;
        this.behavior = new FightWithBears();
        this.damage = behavior.getDamage();
    }

    public SummonerHero() {
    }

    @Override
    public void setBehavior(FightBehavior fightBehavior) {
        if (fightBehavior instanceof FightWithSummons) {
            this.damage = behavior.getDamage();
            this.behavior = fightBehavior;
        }
    }

    @Override
    public String toString() {
        return "I'm a summoner fighter. " + super.toString();
    }
}
