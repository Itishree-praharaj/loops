import java.util.Scanner;

public class InvertedNumHollowHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for (int j =1;j<=rows;j++) {
                if(i==1){
                    System.out.print(j+"\t");
                }
                else if(j==1){
                    System.out.print(i+"\t");
                }
                else if (i==1) {
                    System.out.print(j+"\t");
                }
                else if(i+j==rows+1){
                    System.out.print(rows+"\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
