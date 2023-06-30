package by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters;

import java.util.Objects;

public class StrengthenerForNPC extends NonPlayerCharacter {
    protected NonPlayerCharacter npc;

    @Override
    public String toString() {
        return npc.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StrengthenerForNPC that = (StrengthenerForNPC) o;
        return Objects.equals(npc, that.npc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), npc);
    }

    protected StrengthenerForNPC() {
    }

    @Override
    public String attack() {
        return npc.attack();
    }
}
