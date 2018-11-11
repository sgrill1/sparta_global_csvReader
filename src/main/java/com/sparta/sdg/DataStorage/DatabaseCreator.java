package com.sparta.sdg.DataStorage;

import java.sql.*;

public class DatabaseCreator {
    private final String PATH = "jdbc:oracle:thin:@localhost:1521:xe";
    private final String query = "CREATE TABLE EMPLOYEES_SPARTA (EMP_ID VARCHAR(20), NAME_PREFIX VARCHAR(10), FIRST_NAME VARCHAR(50), MIDDLE_INITIAL VARCHAR(10), LAST_NAME VARCHAR(25), GENDER VARCHAR(20), EMAIL VARCHAR(100), DOB DATE, DATE_OF_JOINING DATE, SALARY NUMBER, PRIMARY KEY (EMP_ID)";
    private final String USER = "hr";
    private final String PASSWORD = "hr";

    public void DatabaseCreator() {

        try (
                Connection connection = DriverManager.getConnection (PATH, USER, PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement (query);
            statement.executeUpdate();

        } catch (SQLException e) {

        }
    }
}

