import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b;
        System.out.println("Enter how long fibonacci series you want");
        b = scan.nextInt();
        int sum, x, y;
        x = 0;
        y = 1;
        System.out.print(x + " " + y);
        sum = 0;
        for (int i = 2; i < b; i++) {
            sum = x + y;
            System.out.print(sum);
            x = y;
            y = sum;
        }
        scan.close();
    }
}
