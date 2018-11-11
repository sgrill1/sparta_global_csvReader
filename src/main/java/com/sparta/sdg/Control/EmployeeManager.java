package com.sparta.sdg.Control;

import com.sparta.sdg.DataStorage.DatabaseCreator;
import com.sparta.sdg.DataStorage.EmployeeDAO;
import com.sparta.sdg.Model.Employee;
import com.sparta.sdg.Model.EmployeeList;
import com.sparta.sdg.View.DisplayManager;

import java.util.Collection;
import java.util.HashSet;

public class EmployeeManager {
    EmployeeList employeeList;
    EmployeeReader employeeReader;

    public void readFile(){
//        DatabaseCreator databaseCreator = new DatabaseCreator ();
//        databaseCreator.DatabaseCreator ();
        employeeReader = new EmployeeReader ();
        employeeList = employeeReader.readFile ("Resources/EmployeeRecords.csv");
        EmployeeDAO employeeDAO = new EmployeeDAO ();
        employeeDAO.addEmployees (createEmployeeHashSet (employeeList));


    }
    public void diplayInfo(){
        DisplayManager displayManager = new DisplayManager ();
        displayManager.displayEmployeeInfo (employeeList.getEmployee ("138700"));
    }

    public Collection createEmployeeHashSet(EmployeeList employeeList){
        Collection<Employee> employees = new HashSet<>(employeeList.getEmployeeHashMap().values());
        return employees;
    }

}
