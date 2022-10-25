import java.util.Scanner;

public class ConsonantVowelChallenge {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ConsonantVowelChallenge c = new ConsonantVowelChallenge();
        c.consonantVowel();
        scan.close();
    }

    public void consonantVowel() {
        String s;
        System.out.println("Enter Character:");
        s = scan.next();
        if (s.length() > 1 || s.equals(s.indexOf(s))) {
            System.out.println("Invalid Character and charter must be 1 letter");
        } else {
            switch (s) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println(s + " is vowel");
                    break;
                default:
                    System.out.println(s + " is consonant");
            }
        }
    }
}
