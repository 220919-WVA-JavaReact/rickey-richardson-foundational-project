package org.example.service;

import org.example.model.Employee;
import org.example.model.Ticket;
import org.example.dao.employeeDAO;
import org.example.dao.employeeDaoImpl;
import java.util.Scanner;
import org.example.dao.ticketDaoImpl;
import org.example.dao.ticketDAO;


import java.util.List;

public class ticketService {

    Scanner sc = new Scanner(System.in);

    ticketDAO td = new ticketDaoImpl();

    public Ticket create(Employee employee){
        System.out.println("Please enter the amount for your ticket reimbursement request:");
        String a = sc.nextLine();
        int amount = Integer.parseInt(a);
        System.out.println("Please enter the status of your ticket:");
        String status = sc.nextLine();
        System.out.println("Please enter your employee ID:");
        //int employee = sc.nextInt();


        boolean successful = td.createTicket(amount,status,employee);

        if(successful){
            System.out.println("Your ticket has been submitted!");
        } else {
            System.out.println("Invalid ticket submission");
        }
        return null;
    }


    public Employee getAllTickets() {
        return null;
    }
}
