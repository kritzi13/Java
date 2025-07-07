import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        System.out.print("Num1: ");
        int num1 = in.nextInt();

        System.out.print("Num2: ");
        int num2 = in.nextInt();

        System.out.println(greatest(num1, num2) + " is Greatest");
    }

    static int greatest(int a, int b){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }
}
