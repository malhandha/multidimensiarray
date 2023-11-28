package contoh;
public class Contoh {
    public static void main(String[] args) {

        // Deklarasi dan inisialisasi array dua dimensi
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Menampilkan matriks
        System.out.println("Matriks:");
        displayMatrix(matrix);

        // Menjumlahkan semua elemen dalam matriks
        int sum = calculateSum(matrix);
        System.out.println("\nJumlah semua elemen dalam matriks: " + sum);
    }

    // Metode untuk menampilkan matriks
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Metode untuk menghitung jumlah semua elemen dalam matriks
    public static int calculateSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}

    
