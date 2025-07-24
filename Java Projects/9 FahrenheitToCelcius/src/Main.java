import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fahrenheit;
        double celsius;

        System.out.print("Please enter temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();

        celsius = (fahrenheit - 32) * 5f / 9f ;

        System.out.printf("The converted celsius is %.2f: \n", celsius);
    }
}
