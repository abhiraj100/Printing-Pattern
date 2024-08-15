import java.util.Scanner;

public class Pattern35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int stars = 1;
        int spaces = N / 2;

        // Print the top part of the pattern
        for (int i = 1; i <= N; i++) {
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Move to the next row
            System.out.println();

            if (i < N / 2 + 1) {
                stars += 2;
                spaces--;
            } else {
                stars -= 2;
                spaces++;
            }
        }

    }
}
