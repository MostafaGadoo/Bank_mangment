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
public class EmployeeAccount {
    String AccountType;
    double balance;
    private String userName;
    private String password;
    static int accountID;
    private int NationalID;
    ArrayList<EmployeeAccount> E; // the employees are added manualy by the system admins
    
    public EmployeeAccount(){
      E = new ArrayList<EmployeeAccount> ();
          E.add(new EmployeeAccount("Ali","3333","savingAccount",150000,1256854512));
        E.add(new EmployeeAccount("ahmed","5555","savingAccount",150000,125285455));
        E.add(new EmployeeAccount("mohamed","3333","savingAccount",150000,45121212));
    }
    public EmployeeAccount(String userName, String password,String AccountType, double balance,int NationalID) {
        this.AccountType = AccountType;
        this.balance = balance;
        this.userName = userName;
        this.password = password;
       this.NationalID=NationalID;
      
    }

   


    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getAccountID() {
        return accountID;
    }

    public static void setAccountID(int accountID) {
        EmployeeAccount.accountID = accountID;
    }

    public int getNationalID() {
        return NationalID;
    }

    public void setNationalID(int NationalID) {
        this.NationalID = NationalID;
    }

   

    public ArrayList<EmployeeAccount> getEmployee() {
        return E;
    }

    public void setEmployee(ArrayList<EmployeeAccount> E) {
        this.E = E;
    }
    
    public EmployeeAccount Employee_login (String name, String pass)
    {
      
            
        EmployeeAccount cust  = null;
        for (int i=0; i<E.size(); i++)
        { 
            cust = (EmployeeAccount) E.get(i);
            if (cust.getUserName().equals(name) && cust.getPassword().equals(pass))
                return cust;
        }
        
    
    
        return null;
    }

    }
    
