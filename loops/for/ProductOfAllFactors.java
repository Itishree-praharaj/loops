import java.util.Scanner;

public class ProductOfAllFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a =sc.nextInt();
        long product=1;
        for(int i=1;i<=a/2;i++){
            if(a%i==0){
                product*=i;
            }
        }
        product*=a;
        System.out.println("The product of all the factors of "+a+" is "+product);
    }
}
