import java.util.Scanner;

public class Pattern29 {
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
            int p = 1;
            while (j <= i){
                System.out.print(p);
                p++;
                j++;
            }

            p = i-1;
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
