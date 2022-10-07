package org.example.service;

import org.example.dao.EmployeeDAOImplPostgres;
import org.example.dao.employeeDAO;
import org.example.dao.employeeDaoImpl;
import org.example.model.Employee;

import java.util.List;
import java.util.Scanner;

public class employeeService {
    // provide the logic for options and eventually call upon the DAO to persist the info we request

    employeeDAO ed = new EmployeeDAOImplPostgres(); // can change implementation

    Scanner sc = new Scanner(System.in);

    public Employee login(){
        System.out.println("Please enter your username:");
        String username = sc.nextLine(); // saves user input to variable
        System.out.println("Please enter your password:");
        String password = sc.nextLine(); // saves user input to variable


        Employee employ = ed.getByUsername(username); // calling database to grab info based off username

        if(employ.getUsername().equals(username)){
            // System.out.println(username);
            System.out.println("You have been logged in!");
            //System.out.println(employ);

        } else {
            System.out.println("INVALID LOGIN");
            //System.out.println(username);
        }
        return employ;
    }

    public Employee register(){
        System.out.println("Please enter your First Name:");
        String fname = sc.nextLine();
        System.out.println("Please enter your Last Name:");
        String lname = sc.nextLine();
        System.out.println("Please enter your username:");
        String username = sc.nextLine();
        System.out.println("Please enter your password:");
        String password = sc.nextLine();
        System.out.println("Please enter your email:");
        String email = sc.nextLine();

        Employee employee = ed.createEmployee(fname, lname, username, password, email);

        System.out.println("You have been added to the database!");

        return employee;
    }

    // this is to view all employees

    public void getAllEmployees(){
        System.out.println("Using the database to return all employee objects");

        List<Employee> employeeList = ed.getAllEmployees();

        for(Employee employee: employeeList){ // printing each value of the list
            System.out.println(employee);
        }
    }

}

