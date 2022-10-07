package org.example.dao;

import org.example.model.Employee;
import org.example.model.Ticket;
import org.example.util.connectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//public class ticketDAOImplPostgres implements ticketDAO{
//    @Override
//    public Ticket getByTicketId(int id) {
//        return null;
//    }
//
//    @Override
//    public Ticket createTicket(int amount, String status) {
//        return null;
//    }
//
//
//    @Override
//    public List<Ticket> getAllTickets() {
//
//        // SQL statement to get all employees back from our employees table; SELECT * FROM employee
//        // first connect with connection object
//
//        Connection conn = connectionUtil.getConnection();
//        // SQL statement
//
//        // to store all employees create an empty list and store the info inside it
//        List<Ticket> tickets = new ArrayList<>();
//
//        try {
//            Statement stmt = conn.createStatement();
//            // all logic goes inside of the try block
//
//            String sql = "SELECT * FROM ticket";
//
//            ResultSet rs = stmt.executeQuery(sql);
//
//
//
//            while (rs.next()){
//                int id = rs.getInt("id");
//                int amount = rs.getInt("amount");
//                String status = rs.getString("status");
//                int employid = rs.getInt("employee_id")
//
//                // Create an employee object to store the info every loop
//                Ticket tick = new Ticket(id, amount, status, employid);
//
//                // System.out.println(employ);
//
//                // Add resulting item to list of teachers
//
//                tickets.add(tick);
//
//
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return tickets;
//    }
//}
