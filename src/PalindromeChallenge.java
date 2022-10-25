import java.util.Scanner;

public class PalindromeChallenge {
    public static void main(String[] args) {
        boolean b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to check weather its palindrome or not :");
        int a;
        a = scan.nextInt();
        b = palindrome(a);
        if (b) {
            System.out.println("number is palindrome" + " " + b);
        } else
            System.out.println("Number is non palindrome" + " " + b);

        scan.close();
    }

    public static boolean palindrome(int a) {
        int rev, sum;
        int temp = a;
        sum = 0;
        while (a > 0) {
            rev = a % 10;
            sum = (sum * 10) + rev;
            a = a / 10;
        }
        if (temp == sum)
            return true;
            //System.out.println("Number "+temp+"is Palindrome number ");}
        else {
            //  System.out.println("Number"+temp+"is not palindrome number");
            return false;
        }
    }
}
