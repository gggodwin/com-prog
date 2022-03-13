package BankAcc;

public class CheckingAccount extends Account {

    private  double fee = 1.5;

    //default constructor
     public CheckingAccount (){
         super();
     }

     // constructor with parameter
    public CheckingAccount (int accNumber, double fee){
         super(accNumber);
         this.fee = fee;
    }

    //this is the abstract method at the base class

    public void withdraw (double balance){
        if (balance >= 500){
            System.out.println("The Original Amount: " + this.balance);
            this.balance -= balance;
            if (this.balance > 0){
                System.out.println("Withdraw Successfully");
                System.out.println("Updated Amount: " + this.balance);}
            if(this.balance < 0){
                System.out.print("");
            }
        }
        if (this.balance < 0) {
            System.out.println("Sorry you don`t have enough balance");System.exit(0);
        }
        else if (balance < 500){
            System.out.println("Sorry, the minimum amount to withdraw is 500");
        }
    }
    public void deposit (double balance){
        if (balance >= 500){
            this.balance += balance;
            this.balance -= fee;
            System.out.println("Successfully deposited: " + balance);
            System.out.println("Transaction fee: " + fee);
            System.out.println("Updated balance: " + this.balance);
        }
        else if (balance < 500){
            System.out.println("Sorry, the minimum amount to deposit is 500");
        }
        else
            System.out.println("Negative amount cannot be deposit... Please try again");
    }


    public String toString() {
        return "Bank Account: # " + getAccNumber() +
        " \nPin: " + getPin() +
        " \nRemaining Balance: " +getBalance();
    }
}
