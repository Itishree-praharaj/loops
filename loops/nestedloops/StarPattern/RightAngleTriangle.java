import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int row =sc.nextInt();
        for(int i=1;i<=row;i++){
            for (int j = 1; j<=i; j++) {
                if(j==1||i+j==i*2||i==row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
