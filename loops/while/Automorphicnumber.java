import java.util.Scanner;

public class Automorphicnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num ");
        int n = sc.nextInt();
        int num = n;
        int sqr = n * n;
        System.out.println(sqr);
        int count = 1;
        while (num > 0) {
            count *= 10;
            num /= 10;
        }
        System.out.println(count);
        int rem = sqr % count;
        System.out.println(rem);
        if (rem == n)
            System.out.println("It is a automorphic number");
        else
            System.out.println("It is not a automorphic number");
    }
}
