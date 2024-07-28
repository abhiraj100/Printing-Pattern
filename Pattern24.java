import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {

        // Inverted Triangle

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

      /*
        int i = 1;
        while (i <= n){
            int j = 1;
            while (j <= n - i + 1){
                System.out.print("*");
                j++;
            }
            j = 1;
            while (j <= i){
                System.out.print(" ");
                j++;
            }
            System.out.println();
            i++;
        }

       */
        int i = 1;
        while (i <= n){
            int j = 1;
            while (j <= n - i + 1){
                System.out.print("*");
                j++;
        }
        System.out.println();
        i++;
      }

    }
}