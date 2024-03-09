import java.util.Scanner;

public class HCFforThreeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sechighest = a < b ? a : b;
        int highest = sechighest < c ? sechighest : c;
        int hcf=0;
        for (int i = 1; i <= highest; i++) {
            if (a%i==0&&b%i==0&&c%i==0) {
                hcf=i;
            }
        }
        System.out.println(hcf);
    }
}
