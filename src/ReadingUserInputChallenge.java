import java.util.Scanner;

public class ReadingUserInputChallenge {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ReadingUserInputChallenge r = new ReadingUserInputChallenge();
        r.nextInt();
        scan.close();

    }
//input number and add them all
    public void nextInt() {
        int a[] = new int[10];
        int total = 0;
        boolean has = scan.hasNextInt();
        while (has) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter number " + i + " : ");
                a[i] = scan.nextInt();
                total = total + a[i];
                has = scan.hasNextInt();
                System.out.println(has);
                if (!has) {
                    System.out.println("Invalid Number:");
                    break;
                }
            }
            System.out.println("Total of 10 number is :" + total);
            break;
        }

    }
}
