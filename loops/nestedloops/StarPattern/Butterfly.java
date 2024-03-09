import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int spaces = 7 - 2;
        int stars = 1;
        for (int i = 1; i <= 7; i++) {
            int k = 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
                k++;
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
                k++;
            }
            for (; k <= 7; k++) {
                System.out.print("*");
            }
            if (i <= 7 / 2) {
                spaces -= 2;
                stars++;

            } else {
                spaces += 2;
                stars--;

            }
            System.out.println();
        }
    }
}
