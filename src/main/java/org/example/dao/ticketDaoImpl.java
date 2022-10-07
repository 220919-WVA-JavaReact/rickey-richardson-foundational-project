package org.example.dao;

import org.example.model.Employee;
import org.example.model.Ticket;
import org.example.util.connectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;


public class ticketDaoImpl implements ticketDAO{


    @Override
    public boolean createTicket(int amount, String status, Employee employee) {

        System.out.println("called the createTicket method!");

        Ticket ticket = new Ticket();

        try(Connection conn = connectionUtil.getConnection()) {
            String sql = "INSERT INTO ticket VALUES (?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, amount);
            stmt.setString(2, status);
            stmt.setInt(3, employee.getId());

            int rowsUpdated = stmt.executeUpdate();

            if (rowsUpdated == 1) {
                return true;
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Ticket> getAllTickets() {

        System.out.println("Called the getAllTickets method!");

        Ticket ticket = new Ticket();

        try(Connection conn = connectionUtil.getConnection()) {
            String sql = "SELECT * FROM ticket WHERE employee_id = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            // stmt.setInt(1, Employee.getId());


        } catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Ticket> getTicketByEmployeeId(int id) {
        System.out.println("Called get tickets by employeeId");
        return null;
    }
}
