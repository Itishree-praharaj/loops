import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm= (a>b)?a:b;
        for(;true;){
            if(lcm%a==0 && lcm%b==0){
                break;
            }
            lcm++;
        }
        System.out.println("The lcm of "+a+" and "+b+" is ="+lcm);
    }
}
