import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to which number you want to print fibonacci series");
        int a = sc.nextInt();
        int firstnum=0;
        int secondnum=1;
        System.out.println(firstnum);
        System.out.println(secondnum);
        for(int i=1;i<=a-2;i++){
            int fib=firstnum+secondnum;
            firstnum=secondnum;
            secondnum=fib;
            System.out.println(fib);
        }
    }
}
