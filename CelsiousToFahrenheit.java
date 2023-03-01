import java.util.Scanner;

public class CelsiousToFahrenheit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the temperature in Celsius?");
        
        double tempCelsius = sc.nextDouble();
        double tempFahrenheit = (tempCelsius * 9 / 5) + 32;

        System.out.println(tempCelsius + "°C is " + tempFahrenheit + "°F");

        sc.close();
    }
}
