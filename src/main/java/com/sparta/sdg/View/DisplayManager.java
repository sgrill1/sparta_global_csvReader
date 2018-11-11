package com.sparta.sdg.View;

import com.sparta.sdg.Model.Employee;

public class DisplayManager {
    public void displayEmployeeInfo(Employee value) {
        System.out.println("ID = " + value.getEmpID() + " | Name: " + value.getNamePrefix() + " " + value.getFirstName() + " " + value.getMiddleInitial() + " " + value.getLastName() + " | Gender = " + value.getGender() + " | Email = " + value.getEmail() + " | DoB = " + value.getDateofBirth () + " | Start Date = " + value.getDateOfJoining () + " | Salary = £" + value.getSalary());
    }
}
