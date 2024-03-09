import java.util.Scanner;

public class NumFullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            int num=i;
            for(int j=rows-i;j>=1;j--){
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++){
                System.out.print(num+"\t");
                num++;
            }
            num--;
            for(int j=1;j<=i-1;j++){
                System.out.print(--num+"\t");
            }
            System.out.println();
        }
    }
}
