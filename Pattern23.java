import java.util.Scanner;

public class Pattern23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int i = 1;
        while (i <= n){
            int j = 1;
            while (j <= n - i){
                System.out.print(" ");
                j++;
            }
            j = 1;
            int startingNumber = 1;
            while (j <= i){
                System.out.print(startingNumber);
                startingNumber++;
                j++;
            }
            System.out.println();
            i++;
        }


        /*
        import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int i = 1;
        while (i <= n){
            int j = 1;
            while (j <= n - i){
                System.out.print("*");
                j++;
            }
            j = 1;
            while (j <= i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
         */

    }
}