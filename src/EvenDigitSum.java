import java.util.Scanner;

public class EvenDigitSum {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scan.nextInt();
        int c;
        c = getEvenDigitSum(a);
        if (c >= 1)
            System.out.println("Even number  " + c);
        else
            System.out.println("odd number ");
        scan.close();
    }

    public static int getEvenDigitSum(int a) {
        int b = a;
        int array[] = new int[b];
        int sum = 0;
        System.out.println("Enter value of arrays:");
        for (int i = 0; i < b; i++) {
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 1) {
                if (array[i] % 2 == 0) {
                    sum = sum + array[i];
                }
            } else {
                System.out.println("Wrong number input");
                return -1;
            }

        }
        return sum;
    }
}
