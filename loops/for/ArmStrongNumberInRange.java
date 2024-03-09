import java.util.Scanner;

public class ArmStrongNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower range ");
        int l = sc.nextInt();
        System.out.println("Enter the upper range ");
        int u = sc.nextInt();
        for (int i = l; i <=u; i++) {
            int sum=0;
            int n=i;
            int count=0;
            while(n>0){
                count++;
                n/=10;
            }
            n=i;
            while(n>0){
                int rem=n%10;
                int sq=1;
                for(int j=1;j<=count;j++){
                    sq*=rem;
                }
                sum+=sq;
                n/=10;
            }
            if(sum==i)
            System.out.println(i);
        }
    }
}
