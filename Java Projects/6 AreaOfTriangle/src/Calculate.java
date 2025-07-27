import java.util.Scanner;

public class Calculate {
    /**
     * A simple method that calculates the {@code area of a tringle}
     * and returns result with {@code decimal} values.
     * <br><br> The method takes {@code user input}.
     * It validates the input with recursive request.
     *
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void areaOfTriangle() {

        double height, base, area;

        height = Input.inputNumber("the height");
        base = Input.inputNumber("the perpendicular");

        area = 0.5f * (height * base);

        System.out.printf("Area of the triable is: %.2f\n", area);
    }
}
