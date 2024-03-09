import java.util.Scanner;

public class InvertedFullHollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int stars=(rows)+rows-1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=stars;j++){
                if(i==1||i==j||i+j==(rows*2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
