import java.util.Scanner;

public class SignRightAngleTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number how many number of rows:");
        int a = scan.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
                //   System.out.print(i);
            }
            System.out.println();
        }
        scan.close();
    }
}
