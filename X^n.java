//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
import java.util.Scanner;
public class X {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        System.out.print("X: ");
        int x = in.nextInt();

        System.out.print("n: ");
        int n = in.nextInt();

        System.out.println(power(x,n));


    }

    static int power(int a, int b) {
    return (int) Math.pow(a, b);
    }
}
