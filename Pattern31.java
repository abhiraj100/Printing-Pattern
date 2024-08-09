import java.util.Scanner;

public class Pattern31 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            sc.close();

            for (int i = 1; i <= N; i++) {
                // Print spaces
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }

                // Print asterisks
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }



        }

    }
