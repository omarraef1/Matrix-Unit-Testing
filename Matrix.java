/**
 * This class Matrix represents a mathematical Matrix. It uses an int[][] to
 * store the elements of the Matrix.
 * 
 * @author Rick Mercer and Omar R. Gebril
 */
public class Matrix {

	// instance variables, one of which an int[][]
	private int[][] elements;
	public final int rows;
	public final int columns;

	// Construct a Matrix object that has the same elements as the argument
	public Matrix(int[][] table) {
		rows = table.length;
		columns = table[0].length;

		elements = new int[rows][columns];
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				elements[row][col] = table[row][col];
			}
		}
	}

	// Return the number of rows in this Matrix
	public int rows() {
		// TODO: Complete this method
		return elements.length;
	}

	// Return the number of columns in this Matrix
	public int columns() {
		// TODO: Complete this method
		return elements[0].length;
	}

	// Return the value of the element at the given row and column
	public int get(int row, int column) {
		// TODO: Complete this method
		return elements[row][column];
	}

	//
	// Multiply every element in this matrix by factor
	// BTW: the extra ----s are needed since the default editor
	// would treat 20 spaces as one space (like in a Web Page)
	//
	// 1 2 3 scalarMultiply(2) -> 2 4 6
	// 4 5 6 -------------------> 8 10 12
	//
	public void scalarMultiply(int factor) {
		// TODO: Complete this method
		for (int row = 0; row < elements.length; row++) {
			for (int col = 0; col < elements[0].length; col++) {
				elements[row][col] *= factor;
			}
		}
	}

	//
	// Return the sum of all integers in this Matrix
	// 1 2 3 sumOfAllElements() returns 1+2+3+4+5+6 = 21
	// 4 5 6
	//
	public int sumOfAllElements() {
		// TODO: Complete this method
		int sum = 0;
		for (int row = 0; row < elements.length; row++) {
			for (int col = 0; col < elements[0].length; col++) {
				sum += elements[row][col];
			}
		}
		return sum;
	}

	//
	// Return a new Matrix the is sum of this Matrix and the other Matrix.
	//
	// Sample usage: Matrix c = matrix.add(other);
	//
	// Example:
	// | 4 3 | | 5 4 | | 9 7 |
	// | 2 7 |+| 6 8 |=| 8 15|
	// | 3 1 | | 1 -4| | 4 -3|
	//
	// Precondition: Both this Matrix and the other Matrix
	// have the same number of rows and columns.
	//
	public Matrix add(Matrix other) {
		// TODO: Complete this method
		int[][] temp = new int[elements.length][elements[0].length];
		for (int row = 0; row < elements.length; row++) {
			for (int col = 0; col < elements[0].length; col++) {
				temp[row][col] += elements[row][col];
				temp[row][col] += other.elements[row][col];
			}
		}
		return new Matrix(temp);
	}

	//
	// Change this Matrix to its transpose. Explained at
	// https://en.wikipedia.org/wiki/Transpose
	//
	// 1 2 3 transpose() -> 1 4
	// 4 5 6 -------------> 2 5
	// -------------------> 3 6
	//
	// You will need to declare a temporary array.
	// Don't forget to assign the temporary array back to this.elements
	// elements = temp;
	//
	// The rows become columns and columns becomes row.
	// Don't forget to swap rows and columns.
	//
	public void transpose() {
		// Create a transposed version
		int[][] temp = new int[elements[0].length][elements.length];
		for (int row = 0; row < elements[0].length; row++) {
			for (int col = 0; col < elements.length; col++) {
				temp[row][col] = elements[col][row];
			}
		}
		// Transfer elements back to elements matrix
		elements = new int[temp.length][temp[0].length];
		for (int row = 0; row < temp.length; row++) {
			for (int col = 0; col < temp[0].length; col++) {
				elements[row][col] = temp[row][col];
			}
		}
	}
}
