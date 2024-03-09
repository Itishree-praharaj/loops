import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number ");
        long b = sc.nextLong();
        long dec=0 ,ind=1;
        for(;b!=0;){
            long rem=b%10;
            dec=dec+rem*ind;
            b/=10;
            ind*=2;
        }
        System.out.println("The decimal number is "+dec);
    }
}
