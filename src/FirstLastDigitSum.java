import java.util.Scanner;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        int b, a;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = sumFirstAndLastDigitSum(a);
        if (b > 0)
            System.out.println("Sum of last and first digit is:" + b);
        else
            System.out.println("Invalid number " + b);
        scan.close();
    }

    public static int sumFirstAndLastDigitSum(int a) {
        int n, n1, n2, n3, sum;
        n = a % 10;
        n1 = a / 10;
        n2 = n1 / 10;
        n3 = n1 % 10;
        sum = n + n2;
        if (sum <= 0)
            return -1;
        else
            return sum;
    }
}
