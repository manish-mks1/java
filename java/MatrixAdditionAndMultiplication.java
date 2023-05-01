import java.util.Scanner;
public class MatrixAdditionAndMultiplication{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of rows and columns of the first matrix: ");
      int rows1 = sc.nextInt();
      int cols1 = sc.nextInt();
      int[][] matrix1 = new int[rows1][cols1];
      System.out.println("Enter the elements of the first matrix: ");
      for (int i = 0; i < rows1; i++) {
         for (int j = 0; j < cols1; j++) {
            matrix1[i][j] = sc.nextInt();
         }
      }
      System.out.println("Enter the number of rows and columns of the second matrix: ");
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
      int[][] sum = new int[rows1][cols1];
      for (int i = 0; i < rows1; i++) {
         for (int j = 0; j < cols1; j++) {
            sum[i][j] = matrix1[i][j] + matrix2[i][j];
         }
      }
      System.out.println("First matrix: ");
      printMatrix(matrix1);
      System.out.println("Second matrix: ");
      printMatrix(matrix2);
      System.out.println("Addition of matrix1 and matrix2: ");
      printMatrix(sum);
      int[][] product = new int[rows1][cols2];
      for (int i = 0; i < rows1; i++) {
         for (int j = 0; j < cols2; j++) {
            for (int k = 0; k < cols1; k++) {
               product[i][j] += matrix1[i][k] * matrix2[k][j];
            }
         }
      }
      System.out.println("Product of the two matrices is: ");
      printMatrix(product);
   }
   public static void printMatrix(int[][] matrix) {
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
      }
   }
}
