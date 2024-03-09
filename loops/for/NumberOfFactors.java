import java.util.Scanner;

public class NumberOfFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("There are " + count + " factors of " + a);
    }
}
