package com.sparta.sdg;


import com.sparta.sdg.Control.EmployeeManager;

public class Starter
{
    public static void main( String[] args )
    {
        EmployeeManager employeeManager = new EmployeeManager ();
        employeeManager.readFile();
    }
}
