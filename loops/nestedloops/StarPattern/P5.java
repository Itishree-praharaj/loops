import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows=sc.nextInt();
        int spaces=rows-(rows/2+1);
        for(int i=1;i<=rows;i++){
            if(i<=rows/2){
                for (int j = 1; j <=spaces; j++) {
                    System.out.print("  ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                for(int j=i-1;j>=1;j--){
                    System.out.print(j+" ");
                }
                spaces--;
            }
            else{
                for(int j=1;j<=spaces;j++){
                    System.out.print("  ");
                }
                for(int j=1;j<=rows-i+1;j++){
                    System.out.print(j+" ");
                }
                for(int j=rows-i;j>=1;j--){
                    System.out.print(j+" ");
                }
                spaces++;
            }
            System.out.println();
        }
    }
}
