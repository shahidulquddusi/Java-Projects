import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float height;
        float base;

        System.out.print("Please enter the height of the tringle: ");
        height = input.nextInt();

        System.out.print("Please enter the base of the tringle: ");
        base = input.nextInt();

        float area = 0.5f * (height * base);

        System.out.printf("Area of the triable is: %.1f\n", area );
        }
    }