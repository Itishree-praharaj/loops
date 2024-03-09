import java.util.Scanner;

public class SumOfIntegerDivBy9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number ");
        int s = sc.nextInt();
        System.out.println("Enter the ending number ");
        int e = sc.nextInt();
        int sum=0;
        for(int i=s;i<=e;i++){
            if(i%9==0){
                sum+=i;
            }
        }
        System.out.println("The sum is "+sum);
    }
}
