import java.util.Scanner;
class Solution {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("marks: ");
        int marks = input.nextInt();
        if (marks >= 90){
            System.out.println("Grade A");
        } else if (marks >=70){
            System.out.println("Grade B");
        } else if (marks >= 50){
            System.out.println("Grade C");
        } else if (marks >= 35){
            System.out.println("Grade D");
        } else{
            System.out.println("Fail");
        }
        
    }
}
