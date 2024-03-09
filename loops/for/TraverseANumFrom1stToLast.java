import java.util.Scanner;

public class TraverseANumFrom1stToLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        int n=num;
        int x=1;
        for(;num>9;){
            x*=10;
            num/=10;
        }
         for(;n>0;){
            System.out.println(n/x);
            n%=x;
            x/=10;
         }
    }
}
