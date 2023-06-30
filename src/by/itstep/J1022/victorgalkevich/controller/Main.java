package by.itstep.J1022.victorgalkevich.controller;

import by.itstep.J1022.victorgalkevich.model.collections.CharacterList;
import by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.heroes.ArcherHero;
import by.itstep.J1022.victorgalkevich.view.UserInterface;

public class Main {
    public static void main(String[] args) {
        ArcherHero hero = new ArcherHero();
        ArcherHero hero2 = new ArcherHero();
        ArcherHero hero3 = new ArcherHero();
        ArcherHero hero4 = new ArcherHero();
        CharacterList<ArcherHero> heroes = new CharacterList<>();
        heroes.add(hero);
        heroes.add(hero2);
        heroes.add(hero3);
        heroes.add(hero4);
        UserInterface.show(heroes);
    }
}