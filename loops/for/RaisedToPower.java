import java.util.Scanner;

public class RaisedToPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        System.out.println("Enter the power to which the numbers to be raised");
        int pow = sc.nextInt();
        int res=1;
        for(int i=0;i<pow;i++){
            res=res*num;
        }
        System.out.println("The result is "+res);
    }
}
