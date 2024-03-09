import java.util.Scanner;

public class P4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows= sc.nextInt();
        int colms=1;    
        for (int i = 1; i <=rows; i++) {
            int num=(rows-i)+1;
            for (int j = 1; j <=colms; j++) {
                if(j<i){
                        System.out.print(num);
                        num++;
                }
                if(j==i){
                    System.out.print(0);
                }
                if(j>i){
                        num--;
                        System.out.print(num);
                }
            }
            System.out.println();
            colms+=2;
        }
    }
}