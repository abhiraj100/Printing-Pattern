import java.util.*;

public class Pattern_Parallelogram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        // Print the pattern
        for (int i = 0; i < N; i++) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < N; j++) {
                System.out.print("*");
            }

            System.out.println();
        }// Write your code here

    }
}
