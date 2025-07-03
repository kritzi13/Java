import java.util.Scanner;
public class Sum{
  public static void main(String[] arg){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the your first number: ");
    int num1 = input.nextInt();
    System.out.print("Enter your second number: ");
    int num2 = input.nextInt();
    System.out.println(num1 + num2);
  }
}
