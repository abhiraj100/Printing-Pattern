import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i <= n){
            int spaces = 1;
            while (spaces <= n - i){
                System.out.print(" ");
                spaces++;
            }
            int j = 1;
            int startingNumber = i;
            while (j <= i){
                System.out.print(startingNumber);
                startingNumber++;
                j++;
            }

            // for decreasing (2*i - 1)
            int p = 2*i - 2;
            int k = 1;
            while (k <= i - 1){
                System.out.print(p);
                p--;
                k++;
            }
            System.out.println();
            i++;
        }

    }
}
