public class PrintK {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for (int j = 1; j <=4; j++) {
                if(j==1||(i+j)==5||(i-j)==3)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
