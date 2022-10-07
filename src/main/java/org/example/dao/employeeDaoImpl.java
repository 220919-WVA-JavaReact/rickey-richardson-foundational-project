package org.example.dao;

import org.example.model.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class employeeDaoImpl implements employeeDAO{
    @Override
    public Employee getByUsername(String username) {
        // this is where we talk to db; sql table
        String line = "";
        String splitBy = ",";
        try{
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/testFile")); // reads thru our file

            while ((line = br.readLine()) != null){ // returns boolean
                // we need to check the validity of entered username
                // send the user back to the front
                String[] info = line.split(splitBy);

                if (info[3].equals(username)){
                    int id = Integer.parseInt(info[0]);
                    return new Employee(info[1], info[2], info[3], info[4], info[5]);
                }

            }
        } catch (FileNotFoundException e){ // runs program thru file exception
            e.printStackTrace(); // prints exception
        } catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Employee createEmployee(String fname, String lname, String email, String username, String password) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }
}
