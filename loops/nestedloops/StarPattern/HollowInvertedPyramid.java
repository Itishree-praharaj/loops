public class HollowInvertedPyramid {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=i;j<=7;j++){
                if(j==i||j==7||i==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
