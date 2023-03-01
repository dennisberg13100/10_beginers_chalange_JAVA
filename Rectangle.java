import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("What is the size of the rectangle?");
        System.out.print("Width: ");
        double width = sc.nextDouble();
        System.out.print("Height: ");
        double height = sc.nextDouble(); 
        double perimeter = (2*height) + (2*width);
        double area = width * height;
        System.out.println("The perimeter of this rectangle is " + perimeter + ".");
        System.out.println("The area o this perimeter is " + area + ".");
        sc.close();
    }
}
