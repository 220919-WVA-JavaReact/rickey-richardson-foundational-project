package org.example.service;

import org.example.model.Employee;

import java.util.Scanner;
import org.example.dao.ticketDaoImpl;
import org.example.dao.ticketDAO;
import org.example.model.Ticket;

public class ticketService {

    Scanner sc = new Scanner(System.in);

    ticketDAO td = new ticketDaoImpl();

    public void create(Employee employee){
        Ticket ticket = null;

        System.out.println("Please enter the amount for your ticket reimbursement request:");
        String a = sc.nextLine();
        int amount = Integer.parseInt(a);
        System.out.println("Please enter the reason for your reimbursement request:");
        String reason = sc.nextLine();
//        System.out.println("Please enter your employee ID:");
//        int employee1 = sc.nextInt();

        ticket = new Ticket(amount, reason, employee.getEmployeeid());

        //ticket = td.createTicket(amount, status, employee1);




        //boolean successful = td.createTicket(amount,status,employee1);
        boolean successful = td.createTicket(ticket, employee);


        if(successful){
            System.out.println("Your ticket has been submitted!");
        } else {
            System.out.println("Invalid ticket submission");
        }
    }


    public Employee getAllTickets(Employee loggedEmploy) {
        return null;
    }
}
