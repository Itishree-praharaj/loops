import java.util.Scanner;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of colms ");
        int rows=sc.nextInt();
        int stars=rows;
        for(int i=1;i<=rows/2+1;i++){
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();
            stars-=2;
        }
    }
}
