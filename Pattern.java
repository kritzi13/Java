import java.util.Scanner;
class Pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int col = sc.nextInt();
        for (int i = 1; i <=r ; i++){
            for (char j = (char) 65; j <= (char)65+col; j++){
                System.out.print(j+" ");
            }
            System.out.println();            
        }
    }
}
