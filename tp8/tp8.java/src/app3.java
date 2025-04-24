import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une chaîne : ");
        String ch = sc.nextLine();

        boolean Palindrome = true;
        int n = ch.length();

        for (int i = 0; i < n / 2; i++) {
            if (ch.charAt(i) != ch.charAt(n - 1 - i)) {
                Palindrome = false;
                break;
            }
        }

        if (Palindrome) {
            System.out.println("C'est un palindrome.");
        } else {
            System.out.println("Ce n'est pas un palindrome.");
        }
    }
}