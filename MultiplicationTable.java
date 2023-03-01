import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chose a number and I will make a multiplication table with it:");
        int number = sc.nextInt();

        for ( int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (i * number));
        }

        sc.close();
    }
}
