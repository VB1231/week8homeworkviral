import java.util.Scanner;

public class SharedDigit {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        boolean c;
        SharedDigit s = new SharedDigit();
        c = s.hasShareDigit(a, b);
        System.out.println(c);
        scan.close();
    }

    public boolean hasShareDigit(int a, int b) {
        int x, y;
        if (a <= 10 || b >= 99)
            return false;
        a = a / 10;
        b = b / 10;
        x = a % 10;
        y = b % 10;
        return (a == b || b == x || a == y || x == y);

    }
}
