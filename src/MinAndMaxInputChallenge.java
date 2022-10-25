import java.util.Scanner;

public class MinAndMaxInputChallenge {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        MinAndMaxInputChallenge m = new MinAndMaxInputChallenge();
        m.minMax();
        scan.close();
    }

    public void minMax() {
        System.out.println("Enter how many number you want to enter:");
        int n = scan.nextInt();
        int a[] = new int[n];
        boolean has;
        has = scan.hasNextInt();
        int min = 0;
        int max = 0;
        while (has) {
            //  min=a[0];
            for (int i = 0; i < a.length; i++) {
                System.out.println("Enter number " + i + ":");
                a[i] = scan.nextInt();
                min = a[0];
                max = a[0];
                if (a[i] > max) {
                    max = a[i];

                }
                if (a[i] < min) {
                    min = a[i];
                }
            }
            System.out.println("minimum number :" + min);
            System.out.println("Maximum number :" + max);
            break;

        }
    }
}
