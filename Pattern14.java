import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
        int i = 1;
        while (i<=n){
            int j=1;
            char ch = 'A';
            while (j<=n){
                System.out.print(ch);
                ch++;
                j++;
            }
            System.out.println();
            i++;
        }

         */

        int i = 1;
        while (i<=n){
            int j=1;
            while (j<=n){
                System.out.print((char)('A' + j - 1));
                j++;
            }
            System.out.println();
            i++;
        }

    }
}