import java.util.Scanner;

public class SolidHalfDiamond2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();
        int num=rows/2;
        for(int i=1;i<=rows;i++){
            if(i<=rows/2+1){
                for(int j=1;j<=i;j++){
                    System.out.print((rows/2+i)-1);
                }
            }
            else{
                for(int j=1;j<=rows-i+1;j++){
                    System.out.print((rows/2+i)-1);
                }
            }
            System.out.println();
        }
    }
}
