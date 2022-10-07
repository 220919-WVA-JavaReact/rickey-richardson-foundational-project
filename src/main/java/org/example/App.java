package org.example;

import org.example.model.Employee;
import org.example.service.employeeService;
import org.example.service.ticketService;
import org.example.util.connectionUtil;

import javax.swing.*;
import java.sql.Connection;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // single main method

        Employee employ = new Employee();

        employeeService es = new employeeService();

        ticketService ts = new ticketService();



        Employee LoggedEmploy = null;

        System.out.println("Please choose one of the following options:" + "\n" + "[1] to login" + "\n" + "[2] to register" + "\n" +  "[3] to submit a ticket" + "\n" + "[4] to view all of your tickets tickets" + "\n" + "[5] to exit"); // prompts our users
        Scanner input = new Scanner(System.in); // takes and reads input
        String choice = input.nextLine(); // stores that input in string choice
        // call employeeService class to do something with logic received
        boolean check = true;
        if (choice.equals("1")){
//            System.out.println("Please enter your username");
//            String username = input.nextLine(); // saves user input to variable
//            System.out.println("Please enter your password");
//            String password = input.nextLine(); // saves user input to variable
//            System.out.println("Username: " + username + ", Password: " + password);

            LoggedEmploy = es.login();

        } else if (choice.equals("2")){
//            System.out.println("Please enter your First Name");
//            String fname = input.nextLine(); // saves user input to variable
//            System.out.println("Please enter your Last Name");
//            String lname = input.nextLine(); // saves user input to variable
//            System.out.println("Please enter your username");
//            String username = input.nextLine(); // saves user input to variable
//            System.out.println("Please enter your password");
//            String password = input.nextLine(); // saves user input to variable
//            System.out.println("Please enter your email");
//            String email = input.nextLine(); // saves user input to variable

            LoggedEmploy = es.register();
            //es.getAllEmployees();

        } else if (choice.equals("3")){
            //ts.create();
//            System.out.println("Please enter your username");
//            String username = input.nextLine(); // saves user input to variable
//            System.out.println("Please enter your password");
//            String password = input.nextLine(); // saves user input to variable
//            System.out.println("Please enter the amount of your ticket");
//            int amount = input.nextInt();
            // es.getAllEmployees();

            // ts.create();

        } else if (choice.equals("4")) {
            System.out.println("Please enter your username");
            String username = input.nextLine(); // saves user input to variable
            System.out.println("Please enter your password");
            String password = input.nextLine(); // saves user input to variable

            // need to add logic to show corresponding ticket information to employee

            LoggedEmploy = ts.getAllTickets();


        }   else if (choice.equals("5")){
            check = false;
        } if (LoggedEmploy != null){
            System.out.println("[1] Create your tickets \n[2] View your tickets \n[3] Exit");

            String subchoice = input.nextLine();

            switch (subchoice){
                case "1":
                // create tickets
                    ts.create(LoggedEmploy);
                    break;
                case "2":

                    break;
                case "3":
                    // logout
                    break;
                default:
                    System.out.println("Invalid input");

            }
        }

         //this is us connecting in the DAO layer; put this in the DAO
         // Connection conn = connectionUtil.getConnection();



    }

}
