package by.itstep.J1022.victorgalkevich.model.benahior.abstractLayer;

import by.itstep.J1022.victorgalkevich.model.benahior.interfaceLayer.FightBehavior;

public abstract class FightWithBow implements FightBehavior {
    protected int damage;

    @Override
    public int getDamage() {
        return damage;
    }
}
