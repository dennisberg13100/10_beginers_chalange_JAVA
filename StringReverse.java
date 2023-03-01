import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Write a frase or word and I will print it in reverse order.");
        String string = sc.nextLine();
        String reverseString = "";
        
        for (int i = string.length(); i > 0; i--) {
            reverseString += string.charAt(i-1);
        }
        
        System.out.println(reverseString);
        
        sc.close();
    }
}
