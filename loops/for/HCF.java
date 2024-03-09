import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = (a>b)?b:a;
        int hcf = 0;
        for(int i=1;i<=max;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        System.out.println(hcf);
    }
}
