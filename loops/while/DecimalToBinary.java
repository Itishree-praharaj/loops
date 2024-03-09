import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        long n = sc.nextInt();
        long sum=0;
        int i=1;
        while(n>0){
            long rem=n%2;
            sum=(rem*i)+sum;
            i*=10;
            n/=2;
        }
        System.out.println(sum);
    }
}
