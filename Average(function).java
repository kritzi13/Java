//Enter 3 numbers from the user & make a function to print their average.
import java.util.Scanner;
public class Average {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Num1: ");
        int num1 = in.nextInt();
        System.out.print("Num2: ");
        int num2 = in.nextInt();
        System.out.print("Num3: ");
        int num3 = in.nextInt();


        float result = avg(num1, num2, num3);
        System.out.printf("Average: %.2f", result);


    }
    static float avg(int a, int b, int c){
        float average = (a+b+c)/3f;
        return average;
    }
}
