import java.util.Scanner;

public class SolidHalfDiamond4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int num=1;
        int num2 = rows-1;
        int n=1;
        int n2=rows-1;
        for (int i = 1; i <=rows; i++) {
            if(i<=rows/2){
                for(int j=1;j<=num;j++){
                    if(j%2==0)
                    System.out.print("*");
                    else{
                        System.out.print(n);
                        n++;
                    }
                }
                num+=2;
            }
            else{
                for (int j = 1; j <=num2; j++) {

                    if(j%2==0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(n2);
                        n2++;
                    }
                }
                num2-=2;
                n2-=i+2;
            }
            System.out.println();
        }
    }
}
