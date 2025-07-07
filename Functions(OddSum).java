//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.Scanner;
public class SumOfOdd {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        System.out.print("Num: ");
        int result = in.nextInt();
        int num = odd(result);
        System.out.println("Sum of odd numbers: " + num);

    }
    static int odd(int n){
        int count = 0;
        for (int i = 1; i<= n; i++){
            if (i%2 != 0){
                count = count + i;
            }
        }
        return count;

    }
}
