import java.util.Scanner;

public class Happynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        while(true){
            int sum=0;
            while(n>0){
                int rem=n%10;
                sum+=rem*rem;
                n/=10;
            }
            n=sum;
            if(n<=9){
                break;
            }
        }
        if(n==1)
        System.out.println("It is a happy number");
        else
        System.out.println("It is not a happy number");
    }
}
