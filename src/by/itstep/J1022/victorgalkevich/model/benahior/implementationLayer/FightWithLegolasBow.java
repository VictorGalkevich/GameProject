package by.itstep.J1022.victorgalkevich.model.benahior.implementationLayer;

import by.itstep.J1022.victorgalkevich.model.benahior.abstractLayer.FightWithBow;

public class FightWithLegolasBow extends FightWithBow {
    public FightWithLegolasBow(){
        this.damage = 100;
    }

    @Override
    public String fight() {
        return "I'm fighting with the bow of Legolas.";
    }
}
