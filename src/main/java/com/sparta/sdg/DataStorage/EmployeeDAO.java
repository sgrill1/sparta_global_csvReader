package com.sparta.sdg.DataStorage;

import com.sparta.sdg.Model.Employee;

import java.sql.*;
import java.util.Collection;

public class EmployeeDAO {
    private final String PATH = "jdbc:oracle:thin:@localhost:1521:xe";
    private String query;
    private final String USER = "system";
    private final String PASSWORD = "Acad3my1";
    private Connection connection;

    public void addEmployee(Employee employee) {
        boolean isLocalConnection = false;
        if (connection == null) {
            try {
                connection = DriverManager.getConnection (PATH, USER, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace ();
            }
            isLocalConnection = true;
        }
        query = "INSERT INTO EMPLOYEES_SPARTA (EMP_ID, NAME_PREFIX , FIRST_NAME, MIDDLE_INITIAL, LAST_NAME, GENDER , EMAIL, DOB, DATE_OF_JOINING, SALARY) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement (query);
            statement.setString (1, employee.getEmpID ());
            statement.setString (2, employee.getNamePrefix ());
            statement.setString (3, employee.getFirstName ());
            statement.setString (4, employee.getMiddleInitial ());
            statement.setString (5, employee.getLastName ());
            statement.setString (6, employee.getGender ());
            statement.setString (7, employee.getEmail ());
            statement.setDate (8, Date.valueOf (employee.getDateofBirth ()));
            statement.setDate (9, Date.valueOf (employee.getDateOfJoining ()));
            statement.setDouble (10, employee.getSalary ());
            statement.executeUpdate ();
        } catch (SQLException e) {
            e.printStackTrace ();
        }

    }

    public void addEmployees(Collection<Employee> EmployeeList) {
        try {
            connection = DriverManager.getConnection (PATH, USER, PASSWORD);
            for (Employee employee : EmployeeList) {
                addEmployee (employee);
            }
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    public void getEmployeeInfo(String EmployeeID) {
    }

    public void updateEmployee(String EmployeeID) {
    }

    public void removeEmployee(String Employee) {
    }
}
