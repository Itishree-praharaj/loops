import java.util.Scanner;
class DToB{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		long n= sc.nextLong();
		long sum=0;
		int bit=1;
		while(n>0){
			long rem=n%2;
			sum+=(rem*bit);
			n/=2;
			bit*=10;
		}
		System.out.println(sum);
	}
}