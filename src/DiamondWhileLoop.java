import javafx.scene.transform.Scale;

import java.util.Scanner;

public class DiamondWhileLoop {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the row number");
        n = scan.nextInt();
        int i = 1;
        int j;
        while (i <= n) {
            j = 0;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            j = 0;
            while (j < i * 2 - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i = n - 1;//4
        while (i > 0) {
            j = 0;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            j = 0;
            while (j < i * 2 - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        scan.close();
    }
}
