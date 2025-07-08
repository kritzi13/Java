//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.Scanner;
public class Vote {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        Voter(age);
    }
    static void Voter(int a){
        if (a>=18){
            System.out.println("You can  vote!");
        } else{
            System.out.println("Not eligible");
        }
    }
}
