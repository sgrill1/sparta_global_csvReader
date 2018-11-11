package com.sparta.sdg.Model;

import java.util.HashMap;
import java.util.Map;

public class EmployeeList {

    Map<String, Employee>employeeHashMap;

    public EmployeeList() {
        employeeHashMap = new HashMap<>();
    }

    public void addEmployee(String employeeID, Employee value){
        employeeHashMap.put(employeeID, value);
    }

    public Employee getEmployee(String key){
        return employeeHashMap.get(key);
    }

    public Map<String, Employee> getEmployeeHashMap() {
        return employeeHashMap;
    }
}
