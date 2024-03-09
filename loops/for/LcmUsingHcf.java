import java.util.Scanner;

public class LcmUsingHcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm=0;
        int hcf=0;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        lcm=(a*b)/hcf;
        System.out.println("The lcm is "+lcm);
    }
}
