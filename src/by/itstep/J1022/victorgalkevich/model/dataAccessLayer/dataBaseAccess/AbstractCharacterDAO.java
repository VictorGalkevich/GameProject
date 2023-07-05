package by.itstep.J1022.victorgalkevich.model.dataAccessLayer.dataBaseAccess;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.CharacterInGame;
import by.itstep.J1022.victorgalkevich.model.exceptions.technicalExceptions.DAOExceptions.DAOException;

import java.util.List;

public interface AbstractCharacterDAO<T extends CharacterInGame> {
    T get(int id) throws DAOException;

    List<T> getAll() throws DAOException;

    int insert(T t) throws DAOException;

    int update(T t) throws DAOException;

    int delete(T t) throws DAOException;
}
