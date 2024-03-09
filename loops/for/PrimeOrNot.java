import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        boolean prime=true;
        for(int i =2;i<=Math.sqrt(a);i++){
            if(a==2){
                break;
            }
            if(a%i==0){
                prime=false;
                break;
            }
        }
        if(prime){
            System.out.println("It is a primenumber");
        }
        else{
            System.out.println("It is not a primenumber");
        }
    }
}
