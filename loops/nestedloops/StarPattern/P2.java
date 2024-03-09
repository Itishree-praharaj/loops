import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int spaces=0;
        int spaces1=(rows/2);
       for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <=rows; j++) {
                if(i==j||i+j==rows+1){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
       }
    }
}
