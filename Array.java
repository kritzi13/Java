//Easy example to understand Arrays
import java.util.Scanner;
import java.util.Arrays;
public class ques1 {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int size = in.nextInt();
        String[] name = new String[size];

        for (int i= 0; i <size; i++){
            System.out.print("Student name: ");
            name[i] = in.next();
        }

        System.out.println(Arrays.toString(name));
    }
    
}
