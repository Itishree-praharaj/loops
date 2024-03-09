public class FullPyramid {
    public static void main(String[] args) {
        int stars=1;
        for(int i=1;i<=5;i++){
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            stars+=2;
        }
    }
}
