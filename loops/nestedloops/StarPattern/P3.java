import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int spaces=0;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=(4-i)+1;j++){
                System.out.print(j);
            }
            for (int j = 1; j <=spaces; j++) {
                System.out.print("*");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print("*");
            }
            for(int j=(4-i)+1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            spaces++;
        }
    }
}