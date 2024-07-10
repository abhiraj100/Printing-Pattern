import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int i = 1;
        while (i<=n){
            int j = 1;
            while (j<=n){
                System.out.print(n);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
