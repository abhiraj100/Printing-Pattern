import java.util.Scanner;
public class Pattern35_b {
    public static void main(String args[]){

        // Diamond of stars

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int num=(n/2)+1;
        int count = num - 1;
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= count; j++) {
                System.out.print(" ");
            }

            count--;

            for(int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println("");
        }
        count = 1;

        for(int i = 1; i <= (num - 1); i++) {
            for(int j = 1; j <= count; j++) {
                System.out.print(" ");
            }

            count++;

            for(int k = 1; k <= (2 * (num - i)) - 1; k++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
