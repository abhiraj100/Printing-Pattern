import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i<=n){
            int j = 1;
            while (j <= n - i){
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= i){
                System.out.print(j);
                j++;
            }

            int p = i - 1;
            j = 1;
            while (j <= i - 1){
                System.out.print(p);
                p--;
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
