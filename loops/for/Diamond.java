import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int spaces = rows / 2;
        int stars = 1;
        for (int i = 1; i <= rows / 2; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }
        if (rows % 2 != 0) {
            spaces = 0;
        } else {
            spaces = 1;
            stars -= 2;
        }
        for (int i = rows / 2; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            stars -= 2;
            spaces++;
        }
    }
}
