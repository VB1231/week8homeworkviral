import java.util.Scanner;

public class DigitSumChallenge {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        int s1;
        System.out.println("Enter the number :");
        a = scan.nextInt();
        //  DigitSumChallenge s=new DigitSumChallenge();
        s1 = sum(a);
        if (s1 > 1)
            System.out.println("Total is:" + s1);
        else {
            //   System.out.println(s1);
            System.out.println("Wrong input");
        }
        scan.close();
    }

    static int sum(int a) {
        int n = a % 10;
        int n1 = a / 10;
        int n2 = n1 % 10;
        int n3 = n1 / 10;
        int total = n + n2 + n3;
        //  System.out.println(total);
        if (a >= 10) {
            if (total >= 10 || total <= 1)
                return -1;
            else return total;
        } else return -1;
    }

}
