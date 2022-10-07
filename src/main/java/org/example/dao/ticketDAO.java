package org.example.dao;

import org.example.model.Ticket;
import org.example.model.Employee;

import java.util.List;

public interface ticketDAO {
    boolean createTicket(int amount, String status, Employee employee);

    List<Ticket> getAllTickets();

    List<Ticket> getTicketByEmployeeId(int id);





}
