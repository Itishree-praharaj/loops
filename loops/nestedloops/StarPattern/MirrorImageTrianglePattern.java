public class MirrorImageTrianglePattern {
    public static void main(String[] args) {
        int spaces=0;
        for (int i = 1; i <=(4*2)-1; i++) {
            if(i<4){
                for(int j=1;j<=spaces;j++){
                    System.out.print(" ");
                }
                for (int j = i; j <=4; j++) {
                    System.out.print(j+" ");                
                }
                spaces++;
            }
            else{
                //System.out.println("spaces"+spaces);
                for (int j = 1; j <=spaces; j++) {
                    System.out.print(" ");
                }
                for (int j =spaces+1; j<=4; j++) {
                    System.out.print(j+" ");
                }
                spaces--;
            }
            System.out.println();
        }
    }
}
