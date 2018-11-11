package com.sparta.sdg.Control;

import com.sparta.sdg.Model.Employee;
import com.sparta.sdg.Model.EmployeeList;

import java.io.*;
import java.text.ParseException;

public class EmployeeReader {

    public EmployeeList readFile(String PATH) {

        String line;
        String csvSplitBy = ",";
        EmployeeList employeeList = new EmployeeList ();

        try {
            Reader employeeReader = new BufferedReader(new FileReader(PATH));
            ((BufferedReader) employeeReader).readLine();

            while((line = ((BufferedReader) employeeReader).readLine()) != null){
                String[] employeeInfo = line.split(csvSplitBy);
                Employee newEmployee = new Employee(employeeInfo[0],employeeInfo[1], employeeInfo[2],employeeInfo[3],employeeInfo[4],employeeInfo[5],employeeInfo[6],employeeInfo[7],employeeInfo[8],employeeInfo[9]);
                employeeList.addEmployee (newEmployee.getEmpID (), newEmployee);
            }


        } catch (ParseException | IOException e) {
            e.printStackTrace ();
        }return employeeList;


    }
    public EmployeeList readFileToStream(String PATH){
        String csvSplitBy = ",";
        EmployeeList employeeList = new EmployeeList ();

        try {
            BufferedReader employeeReader = new BufferedReader (new FileReader (PATH));
            employeeReader.lines()
                    .filter(line -> line.)
                    .map(line -> line.split(csvSplitBy))
                    .forEach(Employee newEmployee = new Employee());



        } catch (FileNotFoundException | ParseException e) {
            e.printStackTrace ();
        }

    return employeeList}
}




