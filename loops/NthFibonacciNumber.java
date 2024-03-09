import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        int first=0;
        int second=1;
        int fib=0;
        for(int i=1;i<num;i++){
            fib=first+second;
            first=second;
            second=fib;
        }
        System.out.println(first);
    }
}
