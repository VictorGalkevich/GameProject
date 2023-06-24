package by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters;

import by.itstep.J1022.victorgalkevich.model.comparators.defaultComparators.AscendingDamageComparator;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public abstract class CharacterInGame implements Serializable, Comparable<CharacterInGame> {
    protected int damage;
    protected int moveSpeed;
    protected int healthPoints;
    protected static Comparator comparator;
    static {
        comparator = AscendingDamageComparator.getInstance();
    }

    public void setComparator(Comparator comparator) {
        CharacterInGame.comparator = comparator;
    }

    @Override
    public int compareTo(@NotNull CharacterInGame o) {
        return comparator.compare(this, o);
    }

    protected CharacterInGame(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharacterInGame character = (CharacterInGame) o;
        return damage == character.damage && moveSpeed == character.moveSpeed && healthPoints == character.healthPoints;
    }

    @Override
    public int hashCode() {
        return Objects.hash(damage, moveSpeed, healthPoints);
    }

    protected CharacterInGame(int damage, int moveSpeed, int healthPoints) {
        this.damage = damage;
        this.moveSpeed = moveSpeed;
        this.healthPoints = healthPoints;
    }

    public abstract String attack();

    public int getDamage() {
        return damage;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
