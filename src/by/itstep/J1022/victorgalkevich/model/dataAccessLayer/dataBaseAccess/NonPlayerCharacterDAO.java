package by.itstep.J1022.victorgalkevich.model.dataAccessLayer.dataBaseAccess;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.NonPlayerCharacter;
import by.itstep.J1022.victorgalkevich.model.exceptions.technicalExceptions.DAOExceptions.DAOException;

import java.util.List;

public interface NonPlayerCharacterDAO extends AbstractCharacterDAO<NonPlayerCharacter> {
    @Override
    NonPlayerCharacter get(int id) throws DAOException;

    @Override
    List<NonPlayerCharacter> getAll() throws DAOException;

    @Override
    int insert(NonPlayerCharacter character) throws DAOException;

    @Override
    int update(NonPlayerCharacter character) throws DAOException;

    @Override
    int delete(NonPlayerCharacter character) throws DAOException;
}
