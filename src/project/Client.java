package project;
import java.util.ArrayList;

/**
 *
 * @author agh
 */

import java.util.ArrayList;

/**
 *
 * @author agh
 */

public class Client {
    String username;
    String password;
  int NationalID;
    String AccountType;
    double balance;
    static int clientID;
    ArrayList <Client> Client;

    public Client(String username, String password, int NationalID, String AccountType, double balance) {
        this.username = username;
        this.password = password;
      this.NationalID=NationalID;
        this.AccountType = AccountType;
        this.balance = balance;
        clientID++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNationalID() {
        return NationalID;
    }

    public void setNationalID(int NationalID) {
        this.NationalID = NationalID;
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

    public ArrayList<Client> getClient() {
        return Client;
    }

    public void setClient(ArrayList<Client> Client) {
        this.Client = Client;
    }

    public static int getClientID() {
        return clientID;
    }
    
   public Client client_login (String name, String pass)
    {
        Client cust = null;
        for (int i=0; i<Client.size(); i++)
        { 
            cust = (Client) Client.get(i);
            if (cust.getUsername().equals(name) && cust.getPassword().equals(pass))
                return cust;
        }
        return null;
    }
      
   void Amount_withDraw(double amount){
        if (balance >= amount){
        balance -=amount;
        }
        else {
            System.out.println("The balance in the account is less then the amount you want to withdraw");
        }
   }
   void Amount_deposit(double amount){
     balance += amount;
   }
   public void createAccount(String username, String password, int NationalID, String AccountType, double balance) {
            Client clientUser = new Client(username,password, NationalID, AccountType,balance);
            Client.add(clientUser);
            System.out.println("Client account has been successfully created");
        }
    
    
}
