package org.example.dao;

import org.example.model.Ticket;
import org.example.model.Employee;

import java.util.List;

public interface ticketDAO {
    boolean createTicket(String a, String status, Employee employee);

    boolean createTicket(int amount, String status, Employee employee);

    List<Ticket> getAllTickets();

    List<Ticket> getAllTickets(Employee employee);

    int getTicketByEmployeeId(int id);


    boolean createTicket(int amount, String status, int employee1);

    boolean createTicket();
}
