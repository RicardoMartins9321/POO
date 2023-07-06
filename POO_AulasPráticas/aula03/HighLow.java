package aula03;
import java.util.Scanner;


public class HighLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //generates a random number between 1 and 100
        double randomNum = Math.floor(Math.random() * 100) + 1;
        int count = 1;
        boolean guessed = false;

        while(!guessed){
            //System.out.println(randomNum);
            System.out.print("Guess the number(1-100): ");
            double guess = input.nextDouble();
    
            if(guess == randomNum){
                guessed = true;
                System.out.println("You won! The number was " + randomNum);
                System.out.println("You needed " + count + " guesses");

                System.out.print("Do you want to play again(yes/y or not)? ");
                String choice = input.next().toLowerCase(); 

                if(!choice.equals("y") && !choice.equals("yes")){
                    System.out.println("Thank you for playing");
                    break;
                }
                else{
                    randomNum = Math.floor(Math.random() * 100) + 1;
                    count = 1;
                    guessed = false;
                }
            }
            else if(guess > randomNum ){
                System.out.println("Your guess is too high!");
                count++;
            }
            else if(guess < randomNum){
                System.out.println("Your guess is too low!");
                count++;
            }
        }
        input.close();
    }
}
