import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String ch = sc.nextLine();

        String premierMot = ch.split(" ")[0];
        System.out.println("Premier mot : " + premierMot);

    }
}