public class NumPattern1 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("\t" + count);
                    count++;
                }
            } else {
                for (int j = 1; j <= 5; j++) {
                    count--;
                    System.out.print("\t" + count);
                }
            }
            System.out.println();
            count += 5;
        }
    }
}