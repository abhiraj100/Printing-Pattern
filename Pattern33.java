import java.util.Scanner;

public class Pattern33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for (int i = 1; i <= N; i++) {
            // Print spaces
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // Print increasing numbers
            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print(j);
            }

            // Print decreasing numbers
            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
