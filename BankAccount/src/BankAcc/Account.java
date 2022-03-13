package BankAcc;

// this is the base class
// abstract class
abstract public class Account {

    protected int accNumber;
    protected double balance;
    protected int pin;


    // Default constructor
    public Account() {
    balance = 0;
    }

    //constructor with parameter
    public Account (int accNumber){
        this.accNumber = accNumber;
    }

    //getter method
    public int getAccNumber(){
        return accNumber;
    }

    public double getBalance(){
        return balance;
    }

    public int getPin() {
        return pin;
    }

    //setter method

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }


    // abstract method
    // This method will be implemented to the child class of this parent class
    abstract public void withdraw (double balance);

    abstract public void deposit (double balance);


    public String toString() {
        return "!>>>>>>Bank Account Info<<<<<<<! \n";
    }
}
