import java.util.Scanner;
class FibBetweenTwoNum{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the lower limit");
	int l= sc.nextInt();
	System.out.println("Enter the upper limit");
	int u= sc.nextInt();
	int first=0,second=1,fib;
		while(first<=u){
			if(first>=l)
				System.out.println(first);
			fib=first+second;
			first=second;
			second=fib;
		}
	}
}