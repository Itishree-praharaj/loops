import java.util.Scanner;
class FibTillLimit{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the upper limit ");
	int u = sc.nextInt();
	int first=0,second=1,fib;
		while(first<=u){
			System.out.println(first);
			fib=first+second;
			first=second;
			second=fib;
		}
	}
}