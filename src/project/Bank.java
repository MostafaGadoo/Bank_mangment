/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;

/**
 *
 * @author agh
 */
public class Bank{
    String address;
    int code;
     EmployeeAccount accountUser;
         ArrayList<EmployeeAccount> E;
    public String getAddress() {
        return address;
    }

    public Bank(String address, int code) {
        this.address = address;
        this.code = code;
          E = new ArrayList<EmployeeAccount> ();
      
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }   
    
       void addEmployeeSalary (double amount){
    double Employee_accountBalance =accountUser.getBalance();
            Employee_accountBalance += amount;
            System.out.println("The salary is added");
    }
}
