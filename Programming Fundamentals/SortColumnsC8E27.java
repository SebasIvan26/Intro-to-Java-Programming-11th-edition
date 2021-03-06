/*********************************************************************************
* (Row sorting) Implement the following method to sort the columns in a             *
* two-dimensional array. A new array is returned and the original array is       * 
* intact.                                                                        *
*                                                                                *
* public static double[][] sortColumns(double[][] m)                                *
*                                                                                *
* Write a test program that prompts the user to enter a 3 * 3 matrix of double   *
* values and displays a new column-sorted matrix.                                   *
*********************************************************************************/
/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		// Get a 3 x 3 matrix of double values from user input
				double[][] matrix = getMatrix();
				print(matrix);

				// Get a new sorted matrix
				double[][] sortedMatrix = sortColumns(matrix);

				// Display new sorted matrix
				System.out.println("\nThe column-sorted array is");
				print(sortedMatrix);
			}

			/** getMatrix prompts the user to enter a 3 x 3 
			    matrix of double values then returns it */
			public static double[][] getMatrix() {
				Scanner input = new Scanner(System.in);
				double[][] m = new double[3][3];

				System.out.println("Enter a 3-by-3 matrix row by row:");
				for (int i = 0; i < m.length; i++) {
					for (int j = 0; j < m[i].length; j++) {
						m[i][j] = (int)(Math.random()*23);					}
				}
				return m;
			}

			/** sortColumns return a new sorted array leaving original array intact */
			public static double[][] sortColumns(double[][] m)  {
					// Create a new 3-by-3 matrix
					double[][] sorted = new double[m.length][m[0].length];
					
					// Copy elements to new matrix
					copyMatrix(m, sorted);

					// Sort new matrix by column
					for (int j = 0; j < sorted[0].length; j++) {
						
						for (int i = 0; i < sorted.length - 1; i++) {

							double currentMin = sorted[i][j];
							int minIndex = i;

							for (int row = i + 1; row < sorted.length; row++) {

								if (currentMin > sorted[row][j]) {
									currentMin = sorted[row][j];
									minIndex = row;
									}
								}
								if (minIndex != i) {
								sorted[minIndex][j] = sorted[i][j];
								sorted[i][j] = currentMin;
								}
							}
						}
						return sorted;
			}

			/** copyMatrix copies all the elements in the original matrix to the copy */ 
			public static void copyMatrix(double[][] original, double[][] copy) {
				for (int i = 0; i < original.length; i++) {
					for (int j = 0; j < original[i].length; j++) {
						copy[i][j] = original[i][j];
					}
				}
			}
			//Print any given Matrix 
			public static void print(double[][]m){
				for(double[]i:m)
					System.out.println(Arrays.toString(i));
		}
}