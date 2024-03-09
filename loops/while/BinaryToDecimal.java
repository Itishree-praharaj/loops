import java.util.Scanner;
class BinaryToDecimal{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	long b = sc.nextLong();
	int sum=0;
	int i=1;
	while(b>0){
		long rem=b%10;
		sum+=rem*i;
		i*=2;
		b/=10;
		}
	System.out.println(sum);
	}
}