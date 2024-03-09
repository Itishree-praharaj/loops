import java.util.Scanner;

public class NumberBelongsToFib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int first = 0;
        int second = 1;
        int fib = 0;
        boolean belong = false;
        while (first <= num) {
            if (first == num) {
                belong = true;
                break; 
            }
            fib = first + second;
            first = second;
            second = fib;
        }
        if (belong)
            System.out.println("The number belongs to the fibonacci series ");
        else
            System.out.println("The number does not belongs to the fibonacci series ");
    }
}
