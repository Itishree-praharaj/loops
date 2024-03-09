import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int a = 1; a <= 1000; a++) {
            int num = a;
            int sum = 0;
            while (num > 0) {
                int rem = num % 10;
                sum += factorial(rem);
                num /= 10;
            }
            if (sum == a) {
                System.out.println(a);
            } 
        }
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
