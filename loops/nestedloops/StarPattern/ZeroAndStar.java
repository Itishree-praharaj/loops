import java.util.Scanner;

public class ZeroAndStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <=rows*2+1; j++) {
                if(i==j||j==rows+1||j+i==(rows*2)+2){
                    System.out.print("*");
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
