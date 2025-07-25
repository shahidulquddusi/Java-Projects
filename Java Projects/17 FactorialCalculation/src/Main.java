import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int nThNumber = input.nextInt();

        int i = 0;
        while (i<=nThNumber){
            System.out.println(i);
            i++;
        }

    }
}