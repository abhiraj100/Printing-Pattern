import java.util.Scanner;

public class Pattern27 {
    public static void main(String[] args) {

        // Inverted Number Pattern

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
