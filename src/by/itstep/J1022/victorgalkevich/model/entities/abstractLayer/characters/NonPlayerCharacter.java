package by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters;

import by.itstep.J1022.victorgalkevich.model.comparators.comparatorsForNPCs.AscendingRespawnDelayComparator;
import by.itstep.J1022.victorgalkevich.model.comparators.comparatorsForNPCs.ComparatorForNPC;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Objects;

public abstract class NonPlayerCharacter extends CharacterInGame {
    protected int respawnTimeSeconds;
    private static int amountOfNPCS;

    private int id;
    public NonPlayerCharacter(int damage, int moveSpeed, int healthPoints, int respawnTimeSeconds) {
        super(damage, moveSpeed, healthPoints);
        this.respawnTimeSeconds = respawnTimeSeconds;
        amountOfNPCS++;
        id = amountOfNPCS + 123;
    }

    static {
        comparator = AscendingRespawnDelayComparator.getInstance();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NonPlayerCharacter that = (NonPlayerCharacter) o;
        return respawnTimeSeconds == that.respawnTimeSeconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), respawnTimeSeconds);
    }

    @Override
    public void setComparator(Comparator<CharacterInGame> comparator) {
        if (comparator instanceof ComparatorForNPC) {
            super.setComparator(comparator);
        }
    }

    @Override
    public int compareTo(@NotNull CharacterInGame o) {
        return super.compareTo(o);
    }

    protected NonPlayerCharacter() {
        amountOfNPCS++;
        this.id = amountOfNPCS + 123;
    }

    public int getId() {
        return id;
    }

    protected NonPlayerCharacter(NonPlayerCharacter character) {
        super(character.damage, character.moveSpeed, character.healthPoints);
        this.respawnTimeSeconds = character.respawnTimeSeconds;
        amountOfNPCS++;
        this.id = amountOfNPCS + 123;
    }

    public int getRespawnTimeSeconds() {
        return respawnTimeSeconds;
    }

    @Override
    public String toString() {
        return "NonPlayerCharacter{" +
                "respawnTimeSeconds=" + respawnTimeSeconds +
                ", damage=" + damage +
                ", moveSpeed=" + moveSpeed +
                ", healthPoints=" + healthPoints +
                '}';
    }
}
