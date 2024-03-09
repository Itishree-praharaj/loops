import java.util.Scanner;
class PrimeNo{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the num ");
	int n= sc.nextInt();
	boolean prime=true;
	for(int i=2;i<=n/2;i++){
		if(n%i==0){
			prime=false;
			System.out.println("It is not a prime number");
			break;
			}
		}
	if(prime)
		System.out.println("It is a prime number");
	}
}