package by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.items;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.item.Boots;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.item.Item;

public class BootsOfSpeed extends Boots {
    private static BootsOfSpeed boots;

    {
        this.grantedMoveSpeed = 50;
        this.price = 450;
    }

    private BootsOfSpeed() {
    }

    @Override
    public String toString() {
        return "BootsOfSpeed";
    }

    public static BootsOfSpeed buyBoots() {
        if (null == boots) {
            boots = new BootsOfSpeed();
        }
        return boots;
    }
}
