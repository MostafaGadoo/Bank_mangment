/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author agh
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mostafa Gado
 */
public class EmployeeControl extends EmployeeAccount{
    
     EmployeeAccount accountUser;
     Client clientUser;
      ArrayList <Client> Client;
    ArrayList <EmployeeAccount> account;
    

    public EmployeeControl(String userName, String password, String AccountType, double balance, int NationalID) {
        super(userName, password, AccountType, balance, NationalID);
    }

    
    
    public boolean searchAcount(int nationalID){
        for (int i =0; i < Client.size();i++){
            if(nationalID == clientUser.getClientID()){ // shange the serach to search for the national ID
                System.out.println("The account is found");
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
        
    
    public Client deleteAccount(int nationalID){
    for (int i =0; i <= Client.size();i++){
        if (nationalID == clientUser.getClientID())
        return Client.remove(nationalID);
        }   
        return null;
    }
    
    void Employee_showLogin(String username,String password){
    accountUser.Employee_login(username, password);
    }
    
    
}