import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in fehrenite: ");
        float f = input.nextFloat();
        float c = (f - 32) * 5/9;
        System.out.print("Temperature in Celsius: " + c);
    }
}
