import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a =sc.nextInt();
        int sum=0;
        for(;a>0;){
            sum+=a%10;
            a/=10;
        }
        System.out.println("The sum of the number is "+sum);
    }
}
