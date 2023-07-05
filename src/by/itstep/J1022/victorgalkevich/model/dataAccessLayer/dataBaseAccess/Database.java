package by.itstep.J1022.victorgalkevich.model.dataAccessLayer.dataBaseAccess;

import by.itstep.J1022.victorgalkevich.model.exceptions.technicalExceptions.DAOExceptions.DAOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/chractersdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root1234";

    private Database(){}

    public static Connection getConnection() throws DAOException {
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }catch(SQLException exception){
            throw new DAOException("something went wrong while connecting to data base!");
        }
        return connection;
    }
}
