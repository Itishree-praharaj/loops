import java.util.Scanner;

public class ConertBinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number");
        long a = sc.nextInt();
        long num=a;
        int dec=0;
        int bit=1;
        String s = String.valueOf(num);
        for(int i=1;i<=s.length();i++){
            long rem= a%10;
            if(rem==1){
                dec+=bit;
            }
            bit=bit*2;
            a/=10;
        }
        System.out.println("Decimal Number is "+dec);
    }
}
