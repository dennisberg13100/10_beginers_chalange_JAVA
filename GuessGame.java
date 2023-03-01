import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        
        Random random = new Random(); 
        Scanner sc = new Scanner(System.in);
        //Generates a random number from 0 to 10
        int range = 10;
        int number = random.nextInt(range+1);
        int guess;

        System.out.println("Guess a number between 0 and " + range + ".");

        do {
            guess = sc.nextInt();
            if (guess > number)
                System.out.println("The number is smaller."); 
            else if (guess < number) 
                System.out.println("The number is greater");
            else
                System.out.println("You got it!");
            
        } 
        while (guess != number);

        sc.close();
    }
    
}
