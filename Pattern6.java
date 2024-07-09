import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
        int i = 1;
        while (i<=n){
            int j = n;
            while (j>=1) {
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
        }

         */

        int i = 1;
        while (i<=n){
            int j = 1;
            while (j<=n){
                System.out.print(n-j+1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
