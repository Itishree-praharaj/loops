import java.util.Scanner;

public class LargestAndSmallestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean input = true;
        int max = 0;
        int min = 100000;
        for (; input;) {
            System.out.println("Input");
            int c = sc.nextInt();
            if (c > max)
                max = c;
            if (c < min)
                min = c;

            System.out.println("Do you want to continue Y/Any char");
            char choice = sc.next().trim().charAt(0);
            if (choice == 'y' || c == 'Y')
                input = true;
            else
                input = false;
        }
        System.out.println("The greatest number entered is " + max);
        System.out.println("The smallest number entered is " + min);
    }
}
