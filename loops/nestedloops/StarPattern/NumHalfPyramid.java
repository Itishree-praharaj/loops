import java.util.Scanner;

public class NumHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for (int k = 1; k <=i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
