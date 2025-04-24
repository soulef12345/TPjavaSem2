import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String ch = sc.nextLine();
        System.out.print("Entrez un caractère rechercher : ");
        char car = sc.next().charAt(0);
        int count = 0;
        for (char c : ch.toCharArray()) {
            if (c == car) {
                count++;
            }
        }

        System.out.println("Nombre d'occurrences de '" + car + "' : " + count);

    }
}