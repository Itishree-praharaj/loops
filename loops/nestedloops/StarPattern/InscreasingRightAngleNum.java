import java.util.Scanner;

public class InscreasingRightAngleNum {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int count=0;
        for (int i = 1; i <=rows; i++) {
            if(i%2!=0){
                for (int j = 1; j <=i; j++) {
                    count++;
                    System.out.print("\t"+count);
                }
            }
            else{
                count+=1;
                for (int j = 1; j <=i; j++) {
                    System.out.print("\t"+count);
                    count--;
                }
            }
            count+=i;
            System.out.println();
        }
    }
}