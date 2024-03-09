public class NumSquare {
    public static void main(String[] args) {
        int size=5;
        for (int i = 1; i <=size; i++) {
            if(i%2!=0){
                int k=((i-1)*size)+1;
                for(int j=1;j<=size;j++){
                    System.out.print("\t"+k);
                    k++;
                }
            }
            else{
                int k=i*size;
                for (int j = 1; j <=size; j++) {
                    System.out.print("\t"+k);
                    k--;
                }
            }
            System.out.println();
        }
    }
}
