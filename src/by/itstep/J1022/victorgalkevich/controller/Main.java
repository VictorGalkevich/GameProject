package by.itstep.J1022.victorgalkevich.controller;

import by.itstep.J1022.victorgalkevich.model.collections.CharacterList;
import by.itstep.J1022.victorgalkevich.model.dataAccessLayer.dataBaseAccess.AbstractCharacterDAO;
import by.itstep.J1022.victorgalkevich.model.dataAccessLayer.dataBaseAccess.NonPlayerCharacterDAO;
import by.itstep.J1022.victorgalkevich.model.dataAccessLayer.dataBaseAccess.NonPlayerCharacterDAOImpl;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.NonPlayerCharacter;
import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.PlayerCharacter;
import by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.heroes.ArcherHero;
import by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.heroes.MeleeHero;
import by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.heroes.SummonerHero;
import by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.items.BootsOfSpeed;
import by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.items.SuperBoots;
import by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.npcs.AncientWizard;
import by.itstep.J1022.victorgalkevich.model.exceptions.technicalExceptions.DAOExceptions.DAOException;
import by.itstep.J1022.victorgalkevich.model.logic.CollectionFinder;
import by.itstep.J1022.victorgalkevich.view.UserInterface;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        NonPlayerCharacter character = new AncientWizard();
        AbstractCharacterDAO<NonPlayerCharacter> c = new NonPlayerCharacterDAOImpl();
        try {
            System.out.println(c.insert(character));
        } catch (DAOException e) {
            System.out.println(e.getMessage());;
        }
    }
}