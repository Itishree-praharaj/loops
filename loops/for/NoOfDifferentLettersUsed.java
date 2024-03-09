import java.util.Scanner;

public class NoOfDifferentLettersUsed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.nextLine();
        String str = s.toUpperCase();
        int count=0;
        System.out.println("The following letters are used in the sentence ");
        for(char c = 'A';c<='Z';c++){
            for(int j=0;j<str.length();j++){
                if(c==str.charAt(j)){
                    System.out.print(c+" ");
                    count++;
                    break;
                }
            }
        }
        System.out.println("\nNumber of alphabets used is "+count);
    }
}
