public class Calculate {

    /**
     * A simple method that calculates {@code discount rate}
     * of tickets based on {@code age} and {@code gender}.
     * <br><br> The method takes {@code user input}.
     * It validates the input with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void discountRate() {
        /*
        Conditions: for discountRate
        1. If age < 5, then always 75%      [female discount won't add up]
        2. If female, then 50%
        3. If age > 60, then 25%            [female discount will add up]
        4. Else no discount
        */

        int age = Input.inputNumber("your age");
        boolean isFemale = Input.inputBoolean("Female");

        float discountRate;

//        try { // Exception handler replaced through input handler
        if (age < 5 || (age > 60 && isFemale)) { //'OR cond.' moved from below
            discountRate = 75f;
            System.out.printf("Your have got %.2f%% discount.\n", discountRate);
//            } else if (age > 60 && isFemale) {
//                discountRate = 50f + 25f;//moved above as 'OR cond.' (as both are 75f)
//                System.out.printf("Your have got %.2f%% discount.\n",discountRate);
        } else if (age > 60 /* && !isFemale*/ || isFemale) { //'OR cond.' moved from below
            discountRate = 50f;//alt of (age > 60 && isFemale) is (age > 60)
            System.out.printf("Your have got %.2f%% discount.\n", discountRate);
//            } else if (isFemale) {//moved above as 'OR condition' (as both are 50f)
//                discountRate = 50f;
//                System.out.printf("Your have got %.2f%% discount.\n",discountRate);
        } else {
            discountRate = 0f;
            System.out.printf("Your have got %.2f%% discount.\n", discountRate);
        }
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input.");
//        } // Exception handler replaced through input handler
    }
}
