package org.example.dao;

import org.example.model.Employee;
import org.example.model.Ticket;
import org.example.util.connectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class ticketDaoImpl implements ticketDAO{


    @Override
    public boolean createTicket(Ticket ticket, Employee employee) {

        // System.out.println("Called create ticket method");

        // System.out.println("called the createTicket method!");
        // int amount = Integer.parseInt(a);

        // Ticket ticket = null;

        try(Connection conn = connectionUtil.getConnection()) {
            String sql = "INSERT INTO ticket (amount, reason, employee_id, status) VALUES (?,?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, ticket.getAmount());
            stmt.setString(2, ticket.getStatus());
            stmt.setInt(3, employee.getId());
            stmt.setString(4, "Pending");


            int rowsUpdated = stmt.executeUpdate();

            if (rowsUpdated == 1) {
                return true;
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

//    public boolean createTicket() {
//
//        System.out.println("Called create ticket method");
//
//        // System.out.println("called the createTicket method!");
//        //int amount = Integer.parseInt(a);
//
//        Ticket ticket = new Ticket();
//
//        try(Connection conn = connectionUtil.getConnection()) {
//            String sql = "INSERT INTO ticket (amount, status, employee_id) VALUES (?,?,?)";
//
//            PreparedStatement stmt = conn.prepareStatement(sql);
//
//            stmt.setInt(1, ticket.getAmount());
//            stmt.setString(2, status);
//            stmt.setInt(3, employee.getEmployeeId());
//
//
//            int rowsUpdated = stmt.executeUpdate();
//
//            if (rowsUpdated == 1) {
//                return true;
//            }
//
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//        return false;
//    }

    @Override
    public boolean createTicket(String a, String status, Employee employee) {
        return false;
    }

    @Override
    public boolean createTicket(int amount, String status, Employee employee) {

        return false;
    }

    @Override
    public List<Ticket> getAllTickets() {
        return null;
    }

    @Override
    public List<Ticket> getAllTickets(Employee employee) {

        System.out.println("Called the getAllTickets method!");

        Ticket ticket = new Ticket();

        try(Connection conn = connectionUtil.getConnection()) {
            String sql = "SELECT * FROM ticket WHERE employee_id = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

             stmt.setInt(1, employee.getId());


        } catch (SQLException e){
            e.printStackTrace();
        }

        return (List<Ticket>) ticket;
    }

    @Override
    public int getTicketByEmployeeId(int id) {
        System.out.println("Called get tickets by employeeId");
        return id;
    }

    @Override
    public boolean createTicket(int amount, String status, int employee1) {
        return false;
    }

    @Override
    public boolean createTicket() {
        return false;
    }
}
