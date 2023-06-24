package by.itstep.J1022.victorgalkevich.model.benahior.implementationLayer;

import by.itstep.J1022.victorgalkevich.model.benahior.abstractLayer.FightWithSummons;

public class FightWithBears extends FightWithSummons {
    public FightWithBears(){
        this.damage = 75;
    }
    @Override
    public String fight() {
        return "I'm fighting with the bears.";
    }
}
