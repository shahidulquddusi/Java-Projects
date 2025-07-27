public class Converter {

    /**
     * A simple method that converts values from {@code Fahrenheit}
     * to {@code Celsius}.
     * <br><br> The method takes {@code user input}.
     * It validates the input with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void fahrenheitToCelsius() {

        float fahrenheit, celsius;

        fahrenheit = Input.inputNumber("temperature in Fahrenheit");

        celsius = (fahrenheit - 32) * 5f / 9f;

        System.out.printf("The converted Celsius is: %.2f degree.\n", celsius);
    }
}
