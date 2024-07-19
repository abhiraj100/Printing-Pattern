import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
        int i = 1;
        while (i<=n){
            int j=1;
            char startingChar = 'A';
            while (j<=n){
                System.out.print((char)(startingChar + i - 1));
                startingChar++;
                j++;
            }
            System.out.println();
            i++;
        }

         */

        int i = 1;
        while (i<=n){
            int j=1;
            char ch = 'A';
            while (j<=n){
                System.out.print((char)(ch + i - 1));
                ch++;
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
