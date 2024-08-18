import java.util.Scanner;

public class Pattern__Odd_Square {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int currRow = 1;
        while (currRow <= n) {
            int valueToPrint = (2 * currRow) - 1;
            int currCol = n;
            while (currCol > 0) {
                System.out.print(valueToPrint);
                valueToPrint += 2;
                if (valueToPrint > (2 * n) - 1) {
                    valueToPrint = 1;
                }
                currCol -= 1;
            }
            System.out.println();
            currRow += 1;
        }
    }
}
