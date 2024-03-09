import java.util.Scanner;

public class Magicnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.println(sum);
        // reversing the number
        int s = sum;
        int rev=0;
        while (s > 0) {
            rev=(rev*10)+(s%10);
            s/=10;
        }
        System.out.println(rev);
        //compairing 
        if((rev*sum)==num)
        System.out.println("It is a magic number ");
        else
        System.out.println("It is not a magic number");
    }
}
