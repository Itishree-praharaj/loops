import java.util.Scanner;

public class PrintRevTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int m = 10;
        while (m > 0) {
            System.out.println(a + "*" + m + "=" + (a * m));
            m--;
        }
    }
}
