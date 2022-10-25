import java.util.Scanner;

public class LeftTriangleNestedForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("Enter number of row:");
        a = scan.nextInt();
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= a - i; j++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print("");
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}
