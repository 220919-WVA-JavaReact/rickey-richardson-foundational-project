package org.example.model;

import java.util.Objects;

public class Ticket {

    private int id;
    private int amount;
    private String status;

    private int employee_id;
    private Employee employee;

    public Ticket() {
    }

    public Ticket(int id, int amount, String status, Employee employee) {
        this.id = id;
        this.amount = amount;
        this.status = status;
        this.employee = employee;
    }

    public Ticket(int id, int amount, String status) {
        this.id = id;
        this.amount = amount;
        this.status = status;
    }

    public Ticket(int amount, String status, int employee_id) {
        this.amount = amount;
        this.status = status;
        this.employee_id = employee_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id && amount == ticket.amount && status.equals(ticket.status) && employee.equals(ticket.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, status, employee);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", employee=" + employee +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
