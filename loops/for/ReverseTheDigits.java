import java.util.Scanner;

public class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int rev=0;
        for(;num>0;){
            rev=rev*10+num%10;
            num/=10;
        }
        System.out.println(rev);
    }
}
