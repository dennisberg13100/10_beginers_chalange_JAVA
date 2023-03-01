import java.util.Random;
import java.util.Scanner;

public class HeadAndTails {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random(); 
        
        int number; 
        boolean playAgain = true;

        while ( playAgain ) {
            number = random.nextInt(2);
            if (number == 0) 
                System.out.println("Head");
            else
                System.out.println("Tail");

            System.out.println("press 'a' to play again:");
            char c = sc.next().charAt(0);

            if ( c != 'a') {
                playAgain =  false;
            }
        }

        sc.close();
    }
}