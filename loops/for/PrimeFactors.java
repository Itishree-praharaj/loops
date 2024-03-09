import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        System.out.println("The Prime factors are ");
        for (int i = 1; i <= a; i++) {
            boolean prime = false;
            if (a % i == 0) {
                if (i == 2) {
                    prime = true;
                } else {
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            prime = false;
                            break;
                        } else
                            prime = true;
                    }
                }
            }
            if (prime)
                System.out.println(i);
        }
    }
}
