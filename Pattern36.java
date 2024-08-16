import java.util.*;

public class Pattern36{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("*");
        int currRow =1;
        while(currRow <=n){
            System.out.print("*");
            int currCol =1;
            while(currCol <= currRow){
                System.out.print(currCol);
                currCol +=1;
            }
            currCol = currCol -2;
            while(currCol >=1){
                System.out.print(currCol);
                currCol -=1;
            }
            System.out.println("*");
            currRow +=1;
        }
        currRow =1;
        while(currRow <= n-1){
            System.out.print("*");

            int currCol =1;
            while(currCol <= n - currRow){
                System.out.print(currCol);
                currCol +=1;
            }
            currCol =currCol-2;
            while(currCol >=1){
                System.out.print(currCol);
                currCol -=1;
            }
            System.out.println("*");
            currRow +=1;
        }
        System.out.print("*");
    }
}