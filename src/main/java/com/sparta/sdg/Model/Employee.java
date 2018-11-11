package com.sparta.sdg.Model;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    private String EmpID;
    private String NamePrefix;
    private String FirstName; //finals
    private String MiddleInitial;
    private String LastName;
    private String Gender;
    private String Email;
    private LocalDate DateOfBirth;
    private LocalDate DateOfJoining;
    private double Salary;

    public Employee(String empID, String namePrefix, String firstName, String middleInitial, String lastName, String gender, String email, String dateOfBirth, String dateOfJoining, String salary) throws ParseException {
        this.EmpID = empID;
        this.NamePrefix = namePrefix;
        this.FirstName = firstName;
        this.MiddleInitial = middleInitial;
        this.LastName = lastName;
        this.Gender = gender;
        this.Email = email;
        this.DateOfBirth = changeDate(dateOfBirth);
        this.DateOfJoining = changeDate(dateOfJoining);
        this.Salary = Double.parseDouble(salary);
    }

    public String getEmpID() {
        return EmpID;
    }

    public String getNamePrefix() {return NamePrefix;}

    public String getFirstName() {
        return FirstName;
    }

    public String getMiddleInitial() {
        return MiddleInitial;
    }

    public String getLastName() {return LastName;}

    public String getGender() {
        return Gender;
    }

    public String getEmail() {return Email;}

    public LocalDate getDateofBirth() {
        return DateOfBirth;
    }

    public LocalDate getDateOfJoining() {
        return DateOfJoining;
    }

    public double getSalary() {
        return Salary;
    }

    private LocalDate changeDate(String dateToChange){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
         return LocalDate.parse(dateToChange, formatter);
    }
}

