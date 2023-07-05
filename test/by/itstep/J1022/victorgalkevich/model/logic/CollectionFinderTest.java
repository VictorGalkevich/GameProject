package by.itstep.J1022.victorgalkevich.model.logic;

import by.itstep.J1022.victorgalkevich.model.collections.CharacterList;
import by.itstep.J1022.victorgalkevich.model.comparators.defaultComparators.AscendingHealthPointsComparator;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.CharacterInGame;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.PlayerCharacter;
import by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.heroes.ArcherHero;
import by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.heroes.MeleeHero;
import by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.heroes.SummonerHero;
import by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.items.BootsOfSpeed;
import by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.items.SuperBoots;
import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public class CollectionFinderTest {
    @Test
    public void testMaxPositive() {
        //Arrange
        CharacterList<PlayerCharacter> characters = new CharacterList<>();
        characters.add(new MeleeHero());

        SummonerHero hero = new SummonerHero();
        hero.setBoots(SuperBoots.buyBoots());

        characters.add(hero);

        ArcherHero hero2 = new ArcherHero();
        hero2.setBoots(BootsOfSpeed.buyBoots());

        characters.add(hero2);
        //Assert
        Assert.assertSame(hero, CollectionFinder.max(characters));
    }

    @Test
    public void testMaxNull() {
        //Arrange
        CharacterList<PlayerCharacter> characters = null;
        //Assert
        Assert.assertSame(null, CollectionFinder.max(characters));
    }

    @Test
    public void testMaxZeroSize() {
        //Arrange
        CharacterList<PlayerCharacter> characters = new CharacterList<>();
        //Assert
        Assert.assertSame(null, CollectionFinder.max(characters));
    }

    @Test
    public void testMaxWithNullComparator() {
        //Arrange
        Comparator<CharacterInGame> comparator = null;

        CharacterList<PlayerCharacter> characters = new CharacterList<>();
        characters.add(new MeleeHero());

        SummonerHero hero = new SummonerHero();
        hero.setBoots(SuperBoots.buyBoots());

        characters.add(hero);

        ArcherHero hero2 = new ArcherHero();
        hero2.setBoots(BootsOfSpeed.buyBoots());

        characters.add(hero2);
        //Assert
        Assert.assertSame(hero, CollectionFinder.max(characters, comparator));
    }

    @Test
    public void testMaxWithComparatorPositive() {
        //Arrange
        Comparator<CharacterInGame> comparator = AscendingHealthPointsComparator.getInstance();

        CharacterList<PlayerCharacter> characters = new CharacterList<>();
        MeleeHero hero1 = new MeleeHero();
        characters.add(hero1);

        SummonerHero hero = new SummonerHero();
        hero.setBoots(SuperBoots.buyBoots());

        characters.add(hero);

        ArcherHero hero2 = new ArcherHero();
        hero2.setBoots(BootsOfSpeed.buyBoots());

        characters.add(hero2);
        //Assert
        Assert.assertSame(hero1, CollectionFinder.max(characters, comparator));
    }

    @Test
    public void testMinPositive() {
        //Arrange
        CharacterList<PlayerCharacter> characters = new CharacterList<>();
        MeleeHero hero1 = new MeleeHero();
        characters.add(hero1);

        SummonerHero hero = new SummonerHero();
        hero.setBoots(SuperBoots.buyBoots());

        characters.add(hero);

        ArcherHero hero2 = new ArcherHero();
        hero2.setBoots(BootsOfSpeed.buyBoots());

        characters.add(hero2);
        //Assert
        Assert.assertSame(hero1, CollectionFinder.min(characters));
    }

    @Test
    public void testMinNull() {
        //Arrange
        CharacterList<PlayerCharacter> characters = null;
        //Assert
        Assert.assertSame(null, CollectionFinder.min(characters));
    }

    @Test
    public void testMinZeroSize() {
        //Arrange
        CharacterList<PlayerCharacter> characters = new CharacterList<>();
        //Assert
        Assert.assertSame(null, CollectionFinder.min(characters));
    }

    @Test
    public void testMinWithNullComparator() {
        //Arrange
        Comparator<CharacterInGame> comparator = null;

        CharacterList<PlayerCharacter> characters = new CharacterList<>();
        MeleeHero hero1 = new MeleeHero();
        characters.add(hero1);

        SummonerHero hero = new SummonerHero();
        hero.setBoots(SuperBoots.buyBoots());

        characters.add(hero);

        ArcherHero hero2 = new ArcherHero();
        hero2.setBoots(BootsOfSpeed.buyBoots());

        characters.add(hero2);
        //Assert
        Assert.assertSame(hero1, CollectionFinder.min(characters, comparator));
    }

    @Test
    public void testMinWithComparatorPositive() {
        //Arrange
        Comparator<CharacterInGame> comparator = AscendingHealthPointsComparator.getInstance();

        CharacterList<PlayerCharacter> characters2 = new CharacterList<>();
        MeleeHero hero1 = new MeleeHero();
        characters2.add(hero1);

        SummonerHero hero = new SummonerHero();
        hero.setBoots(SuperBoots.buyBoots());

        characters2.add(hero);

        ArcherHero hero2 = new ArcherHero();
        hero2.setBoots(BootsOfSpeed.buyBoots());

        characters2.add(hero2);
        //Assert
        Assert.assertSame(hero2, CollectionFinder.min(characters2, comparator));
    }

    @Test
    public void testLinearSearchPositive(){
        //Arrange
        Comparator<CharacterInGame> comparator = AscendingHealthPointsComparator.getInstance();

        CharacterList<PlayerCharacter> characters2 = new CharacterList<>();
        MeleeHero hero1 = new MeleeHero();
        characters2.add(hero1);

        SummonerHero hero = new SummonerHero();
        hero.setBoots(SuperBoots.buyBoots());

        characters2.add(hero);

        ArcherHero hero2 = new ArcherHero();
        hero2.setBoots(BootsOfSpeed.buyBoots());

        characters2.add(hero2);
        //Assert
        Assert.assertSame(2, CollectionFinder.linearSearch(characters2, hero2));
    }

    @Test
    public void testLinearSearchNegative(){
        //Arrange
        Comparator<CharacterInGame> comparator = AscendingHealthPointsComparator.getInstance();

        CharacterList<PlayerCharacter> characters2 = new CharacterList<>();
        MeleeHero hero1 = new MeleeHero();
        characters2.add(hero1);

        SummonerHero hero = new SummonerHero();
        hero.setBoots(SuperBoots.buyBoots());

        characters2.add(hero);

        ArcherHero hero2 = new ArcherHero();
        hero2.setBoots(BootsOfSpeed.buyBoots());

        ArcherHero hero3 = new ArcherHero();
        hero3.setBoots(BootsOfSpeed.buyBoots());

        characters2.add(hero2);
        //Assert
        Assert.assertSame(-1, CollectionFinder.linearSearch(characters2, hero3));
    }

    @Test
    public void testLinearSearchNullCollection(){
        //Arrange
        CharacterList<PlayerCharacter> characters2 = null;
        ArcherHero hero3 = new ArcherHero();
        hero3.setBoots(BootsOfSpeed.buyBoots());
        //Assert
        Assert.assertSame(-2, CollectionFinder.linearSearch(characters2, hero3));
    }

    @Test
    public void testLinearSearchEmptyCollection(){
        //Arrange
        CharacterList<PlayerCharacter> characters2 = new CharacterList<>();
        ArcherHero hero3 = new ArcherHero();
        hero3.setBoots(BootsOfSpeed.buyBoots());
        //Assert
        Assert.assertSame(-2, CollectionFinder.linearSearch(characters2, hero3));
    }
}