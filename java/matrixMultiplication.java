import java.util.Scanner;

public class matrixMultiplication {
   public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
      int m1 = matrix1.length;
      int n1 = matrix1[0].length;
      int m2 = matrix2.length;
      int n2 = matrix2[0].length;
      int[][] result = new int[m1][n2];

      for (int i = 0; i < m1; i++) {
         for (int j = 0; j < n2; j++) {
            for (int k = 0; k < n1; k++) {
               result[i][j] += matrix1[i][k] * matrix2[k][j];
            }
         }
      }

      return result;
   }

   public static void printMatrix(int[][] matrix) {
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
      }
   }

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of rows and columns of the first matrix: ");
      int rows1 = sc.nextInt();
      int cols1 = sc.nextInt();
      int[][] matrix1 = new int[rows1][cols1];
      System.out.println("Enter the elements of the first matrix: ");
      for (int i = 0; i < rows1; i++) {
         for (int j = 0; j < cols1; j++) {
            matrix1[i][j] = sc.nextInt();
         }
      }
      System.out.print("Enter the number of rows and columns of the second matrix: ");
      int rows2 = sc.nextInt();
      int cols2 = sc.nextInt();
      int[][] matrix2 = new int[rows2][cols2];
      System.out.println("Enter the elements of the second matrix: ");
      for (int i = 0; i < rows2; i++) {
         for (int j = 0; j < cols2; j++) {
            matrix2[i][j] = sc.nextInt();
         }
      }
      if (cols1 != rows2) {
         System.out.println("Matrix multiplication is not possible.");
         return;
      }
      System.out.println("First Matrix: ");
      printMatrix(matrix1);
      System.out.println("Second Matrix:");
      printMatrix(matrix2);
      System.out.println("Multiplication of the two matrices is: ");
      int[][] product = multiplyMatrices(matrix1, matrix2);
      printMatrix(product);
   }

}
