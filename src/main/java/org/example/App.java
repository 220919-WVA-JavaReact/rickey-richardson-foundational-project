package org.example;

import org.example.model.Employee;
import org.example.model.Ticket;
import org.example.service.employeeService;
import org.example.service.ticketService;
import org.example.util.connectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // single main method

        Employee employ = new Employee();

        employeeService es = new employeeService();

        ticketService ts = new ticketService();


        Employee LoggedEmploy = null;

        Ticket NewTicket = null;

        System.out.println("Please choose one of the following options:" + "\n" + "[1] to login" + "\n" + "[2] to register" + "\n" + "[3] Exit");//+ "\n" + "[4] to view all of your tickets tickets" + "\n" + "[5] to exit"); // prompts our users
        Scanner input = new Scanner(System.in); // takes and reads input
        String choice = input.nextLine(); // stores that input in string choice
        // call employeeService class to do something with logic received
        boolean check = true;
        if (choice.equals("1")) {
//            System.out.println("Please enter your username");
//            String username = input.nextLine(); // saves user input to variable
//            System.out.println("Please enter your password");
//            String password = input.nextLine(); // saves user input to variable
//            System.out.println("Username: " + username + ", Password: " + password);

            LoggedEmploy = es.login();

        } else if (choice.equals("2")) {
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

        } else if (choice.equals("3")) {
//            System.out.println(employ);
//            System.out.println("Please enter your employee ID");
//            int ID = input.nextInt(); // saves user input to variable
//            //System.out.println("Please enter your password");
//            //String password = input.nextLine(); // saves user input to variable
//            System.out.println("Please enter the amount of your ticket");
//            int amount = input.nextInt();
//            System.out.println("Please enter the status of the ticket:");
//            String status = input.nextLine();
            // ts.create(employee.getEmployeeId());
            // es.getAllEmployees();
            //NewTicket = ts.create();
            check = false;


//        } else if (choice.equals("4")) {
//            System.out.println("Please enter your username");
//            String username = input.nextLine(); // saves user input to variable
//            System.out.println("Please enter your password");
//            String password = input.nextLine(); // saves user input to variable
//
//            // need to add logic to show corresponding ticket information to employee
//
//            LoggedEmploy = ts.getAllTickets(LoggedEmploy);
//
//
//        }   else if (choice.equals("5")){
//            check = false;
        }
        if (LoggedEmploy != null) {
            System.out.println("[1] Create a new ticket \n[2] View your tickets \n[3] Exit");

            String subchoice = input.nextLine();

            switch (subchoice) {
                case "1":
                    // create tickets
                    ts.create(LoggedEmploy);
                    break;
//                case "2":
//                    ts.getAllTickets(LoggedEmploy);
//                    break;
                case "2":
                    // logout
                    break;
                default:
                    System.out.println("Invalid input");
//
//            }
//        }
//
//         //this is us connecting in the DAO layer; put this in the DAO
//         // Connection conn = connectionUtil.getConnection();
//
//
//
//    }
//
            }
        }
    }
}