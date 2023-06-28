package by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.items;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.item.Boots;

public class SuperBoots extends Boots {
    @Override
    public String toString() {
        return "SuperBoots";
    }

    private static SuperBoots boots;

    {
        this.grantedMoveSpeed = 120;
        this.price = 2000;
    }

    private SuperBoots() {
    }

    public static SuperBoots buyBoots() {
        if (null == boots) {
            boots = new SuperBoots();
        }
        return boots;
    }
}
