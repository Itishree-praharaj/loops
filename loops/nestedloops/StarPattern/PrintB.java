
public class PrintB {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=4;j++){
                if(i==1||j==1||i==5||(i==3&&j!=4)||(j==4&&i!=3)){
                    System.out.print("* ");
                }
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
