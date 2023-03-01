import java.util.Scanner;

public class AgePlussTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = sc.nextInt(); 
        System.out.println("In ten yers you will be " + (age+10) + " years old!");

        sc.close();
    }
}
