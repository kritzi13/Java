//Calculate the sum of digits
import java.util.Scanner;
public class CountDigit{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the digit: ");
        int digit = in.nextInt();

        int sum = 0;
        
        while(digit>0){
            sum = sum + digit % 10;
            digit = digit / 10;
        }

        System.out.println("Sum of digits: "+ sum);


    }
}
