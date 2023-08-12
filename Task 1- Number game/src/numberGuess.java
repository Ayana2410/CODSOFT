import java.util.Scanner;

public class numberGuess{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String play="Yes";

        //while loop if user wants to play the game again
        while(play.equals("Yes")){

            //Generating random number
            int max=100;
            int min=1;
            int num = (int)(Math.random()*(max-min+1)+min);
            System.out.println("A random number is generated between 1 to 100. ");

            int guess=0;
            int tries=0;

            //while loop executes until the user guess the correct number
            while(guess!= num){
                System.out.println("Guess the number:");
                guess= sc.nextInt();
                tries++;

                //Comparing user's guess with the generated number
                if(guess == num){
                    System.out.println("Great! You have guessed the correct number!");
                    System.out.println("It took you " + tries +" guesses");
                    System.out.println("Would you like to play again? Yes or No:");
                    play= sc.next();
                }
                else if (guess>num) {
                    System.out.println("The number is less than " + guess);
                }
                else if(guess<num){
                    System.out.println("The number is greater than " + guess);
                }
            }
        }
    }
}