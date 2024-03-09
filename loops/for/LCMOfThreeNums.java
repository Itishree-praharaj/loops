import java.util.Scanner;

public class LCMOfThreeNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three nums ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int secondhighest = a > b ? a : b;
        int lcm = secondhighest > c ? secondhighest : c;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0 && lcm % c == 0)
                break;
            lcm++;
        }
        System.out.println(lcm);
    }
}
