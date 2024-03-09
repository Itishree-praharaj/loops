import java.util.Scanner;

public class SumOfAllFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int sum=0;
        for(int i=1;i<=a/2;i++){
            if(a%i==0){
                sum+=i;
            }
        }
        sum+=a;
        System.out.println("The sum of all factors of "+a+" is "+sum);
    }
}
