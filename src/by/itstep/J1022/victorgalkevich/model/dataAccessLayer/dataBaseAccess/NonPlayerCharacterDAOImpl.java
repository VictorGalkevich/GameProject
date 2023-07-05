package by.itstep.J1022.victorgalkevich.model.dataAccessLayer.dataBaseAccess;

import by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.characters.NonPlayerCharacter;
import by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.npcs.AncientWizard;
import by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.npcs.PurpleMonster;
import by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.npcs.UltraBoss;
import by.itstep.J1022.victorgalkevich.model.entities.implementationLayer.npcs.WeakCreep;
import by.itstep.J1022.victorgalkevich.model.exceptions.technicalExceptions.DAOExceptions.DAOException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NonPlayerCharacterDAOImpl implements NonPlayerCharacterDAO {
    @Override
    public NonPlayerCharacter get(int id) throws DAOException {
        if (id < 1){
            return null;
        }
        String sql = "SELECT damage, moveSpeed, healthPoints, respawnTime, idType FROM characters INNER JOIN types ON types.idType = characters.idTypeC WHERE idcharacters = ?";
        NonPlayerCharacter character = null;
        try (Connection con = Database.getConnection();
             PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet set = statement.executeQuery();
            if (set.next()) {
                int damage = set.getInt("damage");
                int moveSpeed = set.getInt("moveSpeed");
                int healthPoints = set.getInt("healthPoints");
                int respawnTime = set.getInt("respawnTime");
                int idType = set.getInt("idType");

                switch (idType) {
                    case 1 -> character = new AncientWizard(damage, moveSpeed, healthPoints, respawnTime);
                    case 2 -> character = new PurpleMonster(damage, moveSpeed, healthPoints, respawnTime);
                    case 3 -> character = new WeakCreep(damage, moveSpeed, healthPoints, respawnTime);
                    case 4 -> character = new UltraBoss(damage, moveSpeed, healthPoints, respawnTime);
                }
            }
            set.close();
        } catch (SQLException exception) {
            throw new DAOException("Error while retrieving from data base by id!");
        }
        return character;
    }

    @Override
    public List<NonPlayerCharacter> getAll() throws DAOException {
        List<NonPlayerCharacter> characters = new ArrayList<>();
        String sql = "SELECT damage, moveSpeed, healthPoints, respawnTime, idType FROM characters INNER JOIN types ON types.idType = characters.idTypeC";
        try (Connection con = Database.getConnection();
             Statement statement = con.createStatement();
             ResultSet set = statement.executeQuery(sql)) {
            while (set.next()) {
                int damage = set.getInt("damage");
                int moveSpeed = set.getInt("moveSpeed");
                int healthPoints = set.getInt("healthPoints");
                int respawnTime = set.getInt("respawnTime");
                int idType = set.getInt("idType");
                NonPlayerCharacter character = null;
                switch (idType) {
                    case 1 -> character = new AncientWizard(damage, moveSpeed, healthPoints, respawnTime);
                    case 2 -> character = new PurpleMonster(damage, moveSpeed, healthPoints, respawnTime);
                    case 3 -> character = new WeakCreep(damage, moveSpeed, healthPoints, respawnTime);
                    case 4 -> character = new UltraBoss(damage, moveSpeed, healthPoints, respawnTime);
                }
                characters.add(character);
            }
        } catch (SQLException exception) {
            throw new DAOException("Error while retrieving from data base!");
        }
        return characters;
    }

    @Override
    public int insert(NonPlayerCharacter character) throws DAOException {
        if (character == null){
            return -1;
        }
        int result = -1;
        String sql = "INSERT INTO characters(idcharacters, damage, moveSpeed, healthPoints, respawnTime, idTypeC) VALUES(?, ?, ?, ?, ?, ?);";

        try (Connection con = Database.getConnection();
             PreparedStatement statement = con.prepareStatement(sql)) {

            statement.setInt(1, character.getId());
            statement.setInt(2, character.getDamage());
            statement.setInt(3, character.getMoveSpeed());
            statement.setInt(4, character.getHealthPoints());
            statement.setInt(5, character.getRespawnTimeSeconds());

            if (character instanceof AncientWizard) {
                statement.setInt(6, 1);
            } else if (character instanceof PurpleMonster) {
                statement.setInt(6, 2);
            } else if (character instanceof WeakCreep) {
                statement.setInt(6, 3);
            } else {
                statement.setInt(6, 4);
            }

            result = statement.executeUpdate();
        } catch (SQLException exception) {
            throw new DAOException("Error occurred while inserting!");
        }
        return result;
    }

    @Override
    public int update(NonPlayerCharacter character) throws DAOException {
        if(character == null){
            return -1;
        }
        int result = -1;
        String sql = "UPDATE characters SET damage = ?, moveSpeed = ?, healthPoints = ?, respawnTime = ?, idTypeC = ? WHERE idcharacters = ?";
        try(Connection con = Database.getConnection();
            PreparedStatement statement = con.prepareStatement(sql)){
            statement.setInt(1, character.getDamage());
            statement.setInt(2, character.getMoveSpeed());
            statement.setInt(3, character.getHealthPoints());
            statement.setInt(4, character.getRespawnTimeSeconds());

            if (character instanceof AncientWizard) {
                statement.setInt(5, 1);
            } else if (character instanceof PurpleMonster) {
                statement.setInt(5, 2);
            } else if (character instanceof WeakCreep) {
                statement.setInt(5, 3);
            } else {
                statement.setInt(5, 4);
            }

            statement.setInt(6, character.getId());
            result = statement.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException("Error occurred while deleting the instance");
        }
        return result;
    }

    @Override
    public int delete(NonPlayerCharacter character) throws DAOException {
        if(character == null){
            return -1;
        }
        int result = -1;
        String sql = "DELETE FROM characters WHERE idcharacters = ?";
        try(Connection con = Database.getConnection();
            PreparedStatement statement = con.prepareStatement(sql)){
            statement.setInt(1, character.getId());
            result = statement.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException("Error occurred while deleting the instance");
        }
        return result;
    }
}
