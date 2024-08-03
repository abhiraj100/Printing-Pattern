import java.util.Scanner;

public class Pattern26 {
    public static void main(String[] args) {

        // Inverted Number Pattern

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int i = 1;
        while (i <= n){
            int j = 1;
            while (j <= n - i + 1){
                System.out.print(n-i+1);
                j++;
            }
            System.out.println();
            i++;
        }

        /*
        int N = sc.nextInt();
        sc.close();

        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
         */

    }
}