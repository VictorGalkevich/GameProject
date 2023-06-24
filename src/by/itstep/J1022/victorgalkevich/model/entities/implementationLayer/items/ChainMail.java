package by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.items;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.item.Armor;

public class ChainMail extends Armor {
    @Override
    public String toString() {
        return "ChainMail";
    }

    private static ChainMail chainMail;

    {
        this.grantedHealthPoints = 450;
        this.price = 700;
    }

    private ChainMail(){}

    public static ChainMail buyChainMail() {
        if (null == chainMail) {
            chainMail = new ChainMail();
        }
        return chainMail;
    }
}
