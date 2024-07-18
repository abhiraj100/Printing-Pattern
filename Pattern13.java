import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 0;
        while (i<=n){
            int j=1;
            while (j<=i){
                System.out.print(i-j+1);
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
