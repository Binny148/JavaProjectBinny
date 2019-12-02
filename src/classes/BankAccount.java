package classes;

public class BankAccount {

    String holderName;
    String type;
    int accountNumber;
    double balance;

    public void deposit(double amount){
        System.out.println(amount + " deposited to your account");
        this.balance += amount;
    }
    public void transfer (double amount){
        if(this.balance >= amount){
            System.out.println(amount + " $ is transfered from your account");
            balance -= amount;
        }
        else{
            System.out.println("you don't have enough fund. Transfer failed");
        }
    }
    public void info(){
        System.out.println("\nName: " + this.holderName);
        System.out.println("Balance: "  + this.balance + "$");
        System.out.println("Type: " + this.type);
        System.out.println("Account number: " + this.accountNumber);
    }
}
