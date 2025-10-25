public class Pattern {

    static int number = Input.inputNumber("a");
    static String str = "*  ";
    static String blank = "   ";

    static void increasingDots(int number) {
        System.out.print("Increasing dot pattern:");
        for (int i = 0; i <= number; i++) {
            System.out.println(str.repeat(i));
        }
    }

    static void decreasingDots(int number) {
        System.out.println("\nDecreasing dot pattern:");
        for (int i = number; i >= 1; i--) {
            System.out.println(str.repeat(i));
        }
    }

    static void increasingReverseDots(int number) {
        System.out.println("\nIncreasing reverse dot pattern:");
        for (int i = 1; i <= number; i++) {
            System.out.print(blank.repeat(number - i));
            System.out.println(str.repeat(i));
        }
    }

    static void decreasingReverseDots(int number) {
        System.out.println("\nDecreasing reverse dot pattern:");
        for (int i = number; i >= 1; i--) {
            System.out.print(blank.repeat(number - i));
            System.out.println(str.repeat(i));
        }
    }

}
