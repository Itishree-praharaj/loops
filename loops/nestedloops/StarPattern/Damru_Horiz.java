import java.util.Scanner;

public class Damru_Horiz {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int lines = scn.nextInt();

        for (int i = 1; i <= lines; i++) {

            for (int j = 1; j <= lines; j++) {

                if (i == j || i - j == (lines - 1) || j == 1 || j == lines)
                    System.out.print("* ");

                else {
                    System.out.print("  ");
                }

            }

            System.out.println();
        }

    }
}
