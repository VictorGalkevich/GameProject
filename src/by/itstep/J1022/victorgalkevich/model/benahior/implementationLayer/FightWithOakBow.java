package by.itstep.J1022.victorgalkevich.model.benahior.implementationLayer;

import by.itstep.J1022.victorgalkevich.model.benahior.abstractLayer.FightWithBow;

public class FightWithOakBow extends FightWithBow {
    public FightWithOakBow() {
        this.damage = 90;
    }

    @Override
    public String fight() {
        return "I'm fighting with an oak bow.";
    }
}
