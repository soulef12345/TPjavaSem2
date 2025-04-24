import java.util.Scanner;

public class app4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaîne : ");
        String ch = sc.nextLine();

        String inverse = "";
        for (int i = ch.length() - 1; i >= 0; i--) {
            inverse += ch.charAt(i);
        }

        System.out.println("Chaîne inversée : " + inverse);
    }
}