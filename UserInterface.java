import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args){
        double initialBalance=10000;
        ATM atm = new ATM(initialBalance);
        Scanner sc= new Scanner(System.in);
        while(true){
            atm.displayOptions();
            System.out.println("Enter your option:");
            int option= sc.nextInt();
            atm.processOption(option);
            System.out.println();
        }
    }
}
