import java.util.Scanner;

public class CountUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean input = true;
        int pos = 0;
        int neg = 0;
        int zero = 0;
        System.out.println("To end the input press x/X");
        for (; input;) {
            System.out.println("input");
            char a = sc.next().trim().charAt(0);
            if (a == 'x' || a == 'X'){
                input = false;
                break;
            }
            if (a-'0' > 0)
                pos++;
            else if (a-'0' < 0)
                neg++;
            else if(a-'0'==0)
                zero++;
        }
        System.out.println("The no +Ve Num = "+pos);
        System.out.println("The no -Ve Num = "+neg);
        System.out.println("The no 0 = "+zero);
    }
}
