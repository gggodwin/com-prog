package BankAcc;

import java.util.Scanner;
// Godwin N. Santiago Dip I.T Batch 2
// Simple Bank BankAcc.Account Program
public class Main {

    public static void main(String[] args) {

        byte choice;
        String choice2;
        int checkAcc;
        int pin;
        Scanner input = new Scanner(System.in);
        Account a   = new CheckingAccount();


        do{
        System.out.println("********* Menu **********");
        System.out.println("1. Create account ");
        System.out.println("2. Withdraw ");
        System.out.println("3. Deposit ");
        System.out.println("4. Check Account ");
        System.out.println("5. Exit");
        System.out.println("-------------------------");
        System.out.print("Please enter the number: ");
        choice = input.nextByte();
        if (choice == 5){
            System.out.println("Thank you");
            return;
        }
        System.out.println("-------------------------");


        // This is for creating an account
        // To access to other choice please create an account first then input y or Y
        // then chose whether to check the info, withdraw, deposit
            if (choice == 1) {
                System.out.print("Please enter an account number: ");
                a.setAccNumber(input.nextInt());
                System.out.print("Enter 6 pin: ");
                a.setPin(input.nextInt());
                if (a.getPin() > 999999){ // max & min pin number
                    System.out.println("Please input 6 pin numbers only");
                    return;//this will stop the program
                }
                if (a.getPin() <= 99999){ // max & min pin number
                    System.out.println("Please input 6 pin");
                    return;
                }
                System.out.println("The account is successfully created !!!");
                System.out.println("account # " + a.getAccNumber());
                System.out.print("Please deposit some money: ");
                //note that this program can only withdraw or deposit equal or greater that 500
                a.deposit(input.nextDouble());
            }

            // to withdraw
            if (choice == 2) {
                System.out.print("Enter pin: ");
                pin = input.nextInt();
                if (pin != a.getPin()){
                    System.out.println("Wrong Pin");
                }

                if (pin == a.getPin()) {
                    System.out.print("Enter amount to withdraw: ");
                    a.withdraw(input.nextDouble());
                }

            }

            // to deposit money
            if (choice == 3) {
                System.out.print("Enter pin: ");
                pin = input.nextInt();
                if (pin != a.getPin()){
                    System.out.println("Wrong Pin");
                }
                else {
                    System.out.print("Enter amount of deposit: ");
                    a.deposit(input.nextDouble());
                }

            }

            //check info
            if (choice == 4) {
                System.out.print("Please enter an account number: ");
                checkAcc = input.nextInt();
                if (checkAcc != a.getAccNumber()){
                    System.out.println("Sorry, Please enter create a valid account first");
                    return;}
                else {
                    System.out.println(">>>>>>Bank Account Info<<<<<<<");
                    System.out.println(a);
                }

            }

        // this is the loop to continue
            System.out.println("-----------------------");
            System.out.print("Do you want to continue: ");
            choice2 = input.next();
        } while (choice2.equalsIgnoreCase("y"));

    }
}
