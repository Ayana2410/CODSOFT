import java.util.Scanner;

class ATM {
    private double balance;
    public ATM(double initialBalance){

        this.balance=initialBalance;
    }
    public void displayOptions(){
        System.out.println("Automated Teller Machine");
        System.out.println("Choose 1 to Check Balance");
        System.out.println("Choose 2 to Withdraw");
        System.out.println("Choose 3 to Deposit");
        System.out.println("Choose 4 to Exit");
    }
    public void processOption(int option) {
        switch (option) {
            case 1:
                checkBalance();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                deposit();
                break;
            case 4:
                System.out.println("Exiting...");
                System.exit(0);
            default:
                System.out.println("Invalid option");
        }
    }
        private void checkBalance(){
            System.out.println("Current balance: " + balance);
        }
        private void withdraw(){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the amount to withdraw:");
            double amount= sc.nextDouble();
            if(balance>=amount) {
                balance = balance - amount;
                System.out.println("Withdrawal Successful! Remaining Balance: " + balance);
            }
            else{
                System.out.println("Insufficient Balance");
            }
        }
        private void deposit(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount to be deposited:");
            double amount= sc.nextDouble();
            balance = balance + amount;
            System.out.println("Deposit Successful! Current Balance: " + balance);
        }
}

