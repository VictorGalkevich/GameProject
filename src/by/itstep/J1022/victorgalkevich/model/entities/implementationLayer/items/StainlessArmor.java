package by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.items;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.item.Armor;

public class StainlessArmor extends Armor {
    @Override
    public String toString() {
        return "StainlessArmor";
    }

    private static StainlessArmor armor;

    {
        this.grantedHealthPoints = 550;
        this.price = 1000;
    }

    private StainlessArmor() {
    }

    public static StainlessArmor buyArmor() {
        if (null == armor) {
            armor = new StainlessArmor();
        }
        return armor;
    }
}
