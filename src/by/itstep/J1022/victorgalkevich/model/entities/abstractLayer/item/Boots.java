package by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.item;

import java.util.Objects;

public class Boots extends Item{
    protected int grantedMoveSpeed;

    protected Boots(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Boots boots = (Boots) o;
        return grantedMoveSpeed == boots.grantedMoveSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grantedMoveSpeed);
    }

    public int getGrantedMoveSpeed() {
        return grantedMoveSpeed;
    }
}
