import java.util.Scanner;

public class NoOfZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        int count=0;
        while(fact>0){
            int rem=fact%10;
            if(rem==0){
                count++;
            }
            fact/=10;
        }
        System.out.println("The number of zeroes present in "+a+" factorila is "+count);
    }
}
