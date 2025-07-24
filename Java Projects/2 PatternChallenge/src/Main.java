//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            String str = "*";
            System.out.print("Increasing:");
            for (int i = 0; i <= 5; i++) {
                System.out.println(str.repeat(i));
            }
            System.out.println("\nDecreasing:");
            for (int i = 5; i >= 1; i--) {
                System.out.println(str.repeat(i));
            }
            String blank = " ";
            System.out.println("\nDecreasing reverse:");
            for (int i = 5; i >= 1; i--) {
                System.out.print(blank.repeat(5 - i));
                System.out.println(str.repeat(i));
            }
            System.out.println("\nIncreasing reverse:");
            for (int i = 1; i <= 5; i++) {
                System.out.print(blank.repeat(5 - i));
                System.out.println(str.repeat(i));
            }

        }
    }
}