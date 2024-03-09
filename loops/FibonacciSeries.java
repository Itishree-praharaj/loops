import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range ");
        int r=sc.nextInt();
        int first=0;
        int fib=0;
        int second=1;
        for(int i=0;i<=r;i++){
            System.out.println(first);
            fib=first+second;
            first=second;
            second=fib;
        }
    }
}
