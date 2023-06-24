package by.itstep.J1022.victorgalkevich.model.benahior.implementationLayer;

import by.itstep.J1022.victorgalkevich.model.benahior.abstractLayer.FightWithSword;

public class FightWithIronSword extends FightWithSword {

    public FightWithIronSword(){
        this.damage = 50;
    }
    @Override
    public String fight() {
        return "I'm fighting with iron sword.";
    }
}
