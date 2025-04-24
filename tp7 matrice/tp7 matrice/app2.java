import java.util.Scanner;

public class MatrixDivisionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie du nombre de lignes et de colonnes
        System.out.print("Entrez le nombre de lignes (max 20) : ");
        int rows = scanner.nextInt();
        System.out.print("Entrez le nombre de colonnes (max 30) : ");
        int cols = scanner.nextInt();

        // Vérification des dimensions
        if (rows <= 0 || rows > 20 || cols <= 0 || cols > 30) {
            System.out.println("Dimensions invalides !");
            return;
        }

        // Saisie du diviseur
        System.out.print("Entrez un diviseur (strictement positif et inférieur à 30) : ");
        int divisor = scanner.nextInt();

        // Vérification du diviseur
        if (divisor <= 0 || divisor >= 30) {
            System.out.println("Diviseur invalide !");
            return;
        }

        int[][] matrix = new int[rows][cols];

        // Saisie des éléments de la matrice
        System.out.println("Entrez les éléments de la matrice :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Élément [" + i + "][" + j + "] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Division des éléments par le diviseur et affichage de la matrice résultante
        System.out.println("\nMatrice après division par " + divisor + " :");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                matrix[i][j] /= divisor;
                rowSum += matrix[i][j];
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("| Somme de la ligne " + (i + 1) + " : " + rowSum);
        }

        scanner.close();
    }
}
