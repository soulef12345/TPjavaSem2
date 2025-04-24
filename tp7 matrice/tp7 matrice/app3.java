import java.util.Scanner;

public class SimpleMatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre de lignes (1-20) : ");
        int nl = scanner.nextInt();
        System.out.print("Nombre de 1colonnes (1-30) : ");
        int nc = scanner.nextInt();

        int[][] M = new int[nl][nc];
        int[] T = new int[nl];

       
        int minSum = Integer.MAX_VALUE, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nl; i++) {
            int sum = 0;
            for (int j = 0; j < nc; j++) {
                M[i][j] = scanner.nextInt();
                sum += M[i][j];
            }
            T[i] = sum;
            minSum = Math.min(minSum, sum);
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println("Sommes des lignes :");
        for (int i = 0; i < nl; i++) {
            System.out.println("Ligne " + (i + 1) + " : " + T[i]);
        }
        System.out.println("Somme minimale : " + minSum);
        System.out.println("Somme maximale : " + maxSum);

        scanner.close();
    }
}

