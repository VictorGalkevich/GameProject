package by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters;

import by.itstep.J1022.victorgalkevich.model.benahior.interfaceLayer.FightBehavior;
import by.itstep.J1022.victorgalkevich.model.comparators.comparatorsForHeroes.ComparatorForHeroes;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.item.Armor;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.item.Boots;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Objects;

public abstract class PlayerCharacter extends CharacterInGame {
    protected FightBehavior behavior;
    protected int netWorth;
    protected Boots boots;
    protected Armor armor;

    {
        this.netWorth = 1000;
    }

    protected PlayerCharacter() {
        super();
    }

    public int getNetWorth() {
        return netWorth;
    }

    @Override
    public void setComparator(Comparator comparator) {
        if (comparator instanceof ComparatorForHeroes) {
            super.setComparator(comparator);
        }
    }

    @Override
    public int compareTo(@NotNull CharacterInGame o) {
        return super.compareTo(o);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PlayerCharacter that = (PlayerCharacter) o;
        return netWorth == that.netWorth && Objects.equals(behavior, that.behavior) && Objects.equals(boots, that.boots) && Objects.equals(armor, that.armor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), behavior, netWorth, boots, armor);
    }

    protected PlayerCharacter(PlayerCharacter character) {
        super(character.damage, character.moveSpeed, character.healthPoints);
        this.netWorth = character.netWorth;
        this.boots = character.boots;
        this.armor = character.armor;
        this.behavior = character.behavior;
    }

    @Override
    public String attack() {
        return behavior.fight();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("My net worth is ").append(netWorth).append(", I deal ").append(damage)
                .append(" damage").append(", have ").append(moveSpeed).append(" move speed and ")
                .append(healthPoints).append(" health points!\n");
        if (armor != null) {
            builder.append("My armor is ").append(armor.toString()).append(". ");
        }
        if (boots != null) {
            builder.append("My boots are ").append(boots.toString()).append(". ");
        }
        builder.append(behavior.fight());
        return builder.toString();
    }

    public void setBoots(Boots boots) {
        this.boots = boots;
        this.netWorth += boots.getPrice();
        this.moveSpeed += boots.getGrantedMoveSpeed();
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
        this.netWorth += armor.getPrice();
        this.healthPoints += armor.getGrantedHealthPoints();
    }

    public abstract void setBehavior(FightBehavior fightBehavior);
}
