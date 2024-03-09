import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        int star = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print("  ");
            }
            for (int j =1; j <= star; j++) {
                System.out.print("* ");
            } 
            star += 2;
            System.out.println();
        }
    }
}