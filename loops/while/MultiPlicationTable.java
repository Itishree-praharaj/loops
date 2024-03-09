import java.util.Scanner;

public class MultiPlicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int m=1;
        while(m<=10){
            System.out.println(a+"*"+m+"="+(a*m));
            m++;
        }
    }
}
