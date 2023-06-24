package by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.item;

import java.util.Objects;

public class Armor extends Item {
    protected int grantedHealthPoints;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Armor armor = (Armor) o;
        return grantedHealthPoints == armor.grantedHealthPoints;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grantedHealthPoints);
    }

    public int getGrantedHealthPoints() {
        return grantedHealthPoints;
    }

    protected Armor() {}

}
