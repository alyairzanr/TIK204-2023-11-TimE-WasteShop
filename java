import java.util.Random;

public class RandomMatrix {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] matrix1 = new int[100][100];
        int[][] matrix2 = new int[100][100];

        // mengisi matriks 1 dan menampilkan bilangan acak pada matriks 1

        System.out.println("Matriks 1:");
        for (int i = 0; i < matrix1.length; i++) { //akses baris 1-100
            for (int j = 0; j < matrix1[i].length; j++) { //akses kolom 1-100
                matrix1[i][j] = rand.nextInt(10); // bilangan acak dari 0 hingga 9
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        // mengisi matriks 2 dan menampilkan bilangan acak pada matriks 2
        System.out.println();
        System.out.println("Matriks 2:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = rand.nextInt(10);
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        int[][] result = new int[100][100];

        // mengalikan matriks 1 dan 2
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                for (int k = 0; k < matrix1[i].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // mencetak matriks hasil ke layar
        System.out.println();
        System.out.println("Hasil Perkalian Matriks:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}