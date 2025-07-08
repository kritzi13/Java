//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;

public class Circumference {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        float radius = in.nextFloat();
        float result = circ(radius);
        System.out.println("Circumference: " + result);
    }

    static float circ(float r) {
        float c = 2 * 3.14f * r;
        return c;
    }
}
