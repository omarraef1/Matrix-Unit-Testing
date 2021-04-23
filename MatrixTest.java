
/**
 * A type that represents a Matrix of integers.
 *
 * Methods include:
 *
 * 1) Matrix(int[][])
 * 2) int get(int, int)
 * 3) int rows()
 * 4) int columns()
 * 5) void scalarMultiply(int inc)
 * 6) Matrix add(Matrix)
 * 7) void transpose()
 * 
 * @author Rick Mercer and Omar R. Gebril
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class MatrixTest {

	@Test
	public void testRowsOrColumns() {
		int[][] a1 = { { 1, 2, 3 }, { -1, -2, -3 } }; // two rows, three columns
		int[][] a2 = { { 4, 5 }, { 6, 7 }, { 8, 9 } }; // three rows, two columns
		int[][] a3 = { { 4, 5 }, { 6, 7 }, { 8, 9 } }; // three rows, two columns

		Matrix m1 = new Matrix(a1);
		Matrix m2 = new Matrix(a2);
		Matrix m3 = new Matrix(a3);

		assertEquals(2, m1.rows());
		assertEquals(3, m1.columns());
		assertEquals(3, m2.rows());
		assertEquals(2, m2.columns());
		assertEquals(8, m2.get(2, 0));
		m2.scalarMultiply(2);
		assertEquals(16, m2.get(2, 0));
		assertEquals(14, m2.get(1, 1));
		Matrix temp = m3.add(m2);
		assertEquals(12, temp.get(0, 0));

	}

	@Test
	public void testRowsOrColumns2() {
		int[][] a1 = { {}, {} }; // two rows, three columns
		int[][] a2 = { { 5, 4 }, { 7, 6 }, { 9, 8 } }; // three rows, two columns
		int[][] a3 = { { 4, 5 }, { 6, 7 }, { 8, 9 } }; // three rows, two columns

		Matrix m1 = new Matrix(a1);
		Matrix m2 = new Matrix(a2);
		Matrix m3 = new Matrix(a3);

		assertEquals(0, m1.columns());
		assertEquals(2, m1.rows());
		assertEquals(39, m2.sumOfAllElements());
		assertEquals(0, m1.sumOfAllElements());
		assertEquals(2, m3.columns());
		assertEquals(3, m3.rows());
		assertEquals(4, m3.get(0, 0));
		assertEquals(5, m3.get(0, 1));
		m3.transpose();
		assertEquals(3, m3.columns());
		assertEquals(2, m3.rows());
		assertEquals(4, m3.get(0, 0));
		assertEquals(6, m3.get(0, 1));
		assertEquals(7, m3.get(1, 1));
		assertEquals(5, m3.get(1, 0));

	}

}
