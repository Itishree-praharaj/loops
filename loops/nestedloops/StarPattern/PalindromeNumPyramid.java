import java.util.Scanner;

public class PalindromeNumPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of rows ");
        int rows = sc.nextInt();
        int spaces=rows-(rows/2+1);
        int num=1;
        int num2=0;
        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <=spaces; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=num;j++){
                System.out.print(j);
            }
            for(int j=num2;j>=1;j--){
                System.out.print(j);
            }
            if(i<=rows/2){
                spaces--;
                num++;
                num2++;
            }
            else{
                spaces++;
                num--;
                num2--;
            }
            System.out.println();
        }
    }
}
