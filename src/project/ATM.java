package project;



/**
 *
 * @author Mostafa Gado
 */
public class ATM {
    private String location;
    private int ATM_id;
    private double ATM_balance;
    private EmployeeAccount Employee_AccountBalance;
    private Client Client_AccountBalance;
    

    public ATM(String location, int ATM_id, double ATM_balance, String address) {
        this.location = location;
        this.ATM_balance = ATM_balance;
        this.ATM_id =ATM_id;
    }

    public double getATM_balance() {
        return ATM_balance;
    }

    public void setATM_balance(double ATM_balance) {
        this.ATM_balance = ATM_balance;
    }
    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getATM_id() {
        return ATM_id;
    }

    public void setATM_id(int ATM_id) {
        this.ATM_id = ATM_id;
    }

    public EmployeeAccount getBalance() {
        return Employee_AccountBalance;
    }
    
    boolean checkBalance(double amount){
        if (amount<= ATM_balance)
        return true;
        else
        return false;
    }
  
    void Employee_withdraw(double amount){
        double Employee_accountBalance = Employee_AccountBalance.getBalance();
        if (checkBalance(amount) == true){
            if(Employee_accountBalance >= amount){
            ATM_balance -= amount;
            Employee_accountBalance -= amount;
            }else {
                System.out.println("No enough money in the ATM");
            }
        }
    }
    
    void Employee_deposit(double amount){
    double Employee_accountBalance =Employee_AccountBalance.getBalance();
            ATM_balance += amount;
            Employee_accountBalance += amount;
            System.out.println("Thank you for the transaction");
    }
    
    void Client_withdraw(double amount){
        double Clinet_accountBalance = Client_AccountBalance.getBalance();
        if (checkBalance(amount) == true){
            if(Clinet_accountBalance >= amount){
            ATM_balance -= amount;
            Clinet_accountBalance -= amount;
            }else {
                System.out.println("No enough money in the ATM");
            }
        }
    }
    void Client_deposit(double amount){
    double Clinet_accountBalance = Client_AccountBalance.getBalance();
            ATM_balance += amount;
            Clinet_accountBalance += amount;
            System.out.println("Thank you for the transaction");
    }
    
    
}