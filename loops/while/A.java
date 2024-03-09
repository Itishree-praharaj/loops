import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int n=sc.nextInt();
        while(true){
            int sum=0;
            while(n>0){
               sum+=n%10;
               n/=10;
            }
            n=sum;
            if(n<=9)
            break;
        }
        System.out.println(n);
    }
}
