import java.util.Scanner;

public class ReverseMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num ");
        int a = sc.nextInt();
        for (int i = 10; i >0; i--) {
            System.out.println(a+" * "+i+" = "+(a*i));
        }
    }
}
