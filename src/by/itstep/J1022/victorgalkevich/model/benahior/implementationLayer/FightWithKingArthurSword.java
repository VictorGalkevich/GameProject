package by.itstep.J1022.victorgalkevich.model.benahior.implementationLayer;

import by.itstep.J1022.victorgalkevich.model.benahior.abstractLayer.FightWithSword;

public class FightWithKingArthurSword extends FightWithSword {

    public FightWithKingArthurSword() {
        this.damage = 80;
    }

    @Override
    public String fight() {
        return "I'm fighting with the sword of King Arthur.";
    }
}
