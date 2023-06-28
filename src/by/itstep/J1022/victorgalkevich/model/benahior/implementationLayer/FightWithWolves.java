package by.itstep.J1022.victorgalkevich.model.benahior.implementationLayer;

import by.itstep.J1022.victorgalkevich.model.benahior.abstractLayer.FightWithSummons;

public class FightWithWolves extends FightWithSummons {
    public FightWithWolves() {
        this.damage = 70;
    }

    @Override
    public String fight() {
        return "I'm fighting with the wolves.";
    }
}
