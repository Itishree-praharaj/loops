import java.util.Scanner;

public class AsciiValues {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character ");
        char c =sc.next().trim().charAt(0);
        System.out.println((int)c);
    }
}
