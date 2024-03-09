import java.util.Scanner;
class Fib{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = sc.nextInt();
		int first=0,second=1,fib;
		for(int i=1;i<=a;i++){
			System.out.print(first+" ");
			fib=first+second;
			first=second;
			second=fib;
		}
	}
}