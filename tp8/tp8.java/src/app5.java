import java.util.Scanner;

public class app5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaîne : ");
        String ch = sc.nextLine();

        String resultat = "" + ch.charAt(0);

        for (int i = 1; i < ch.length(); i++) {
            resultat += "*" + ch.charAt(i);
        }

        System.out.println("Résultat : " + resultat);
    }
}