package BTthuc_hanh1;
import java.util.*;
public class bai4 {
	// ax + by = c
	// dx + ey = f
	public static void hptBac1(double[][] matrix) {
		for (int i = 0;i < matrix.length ; i++) {
			for (int j = i + 1; j < matrix.length ; j++) {
				double m = -matrix[j][i] / matrix[i][i];
				for (int k = 0; k < matrix[0].length; k++) {
					matrix[j][k] = matrix[i][k] * m + matrix[j][k];
				}
			}
		}
		System.out.println(matrix[0].length);
		for(double[] row : matrix) {
			for (double tam : row) {
				System.out.print(tam + " ");
			}
			System.out.println();
		}
		if (matrix[1][1] == 0) {
			if (matrix[1][2] == 0) {
				System.out.println("vo so nghiem");
			}
			else {
				double c = matrix[1][2] / matrix[1][1];
				double d = (matrix[0][2] - matrix[0][1]*c)/matrix[0][0];
				System.out.println(c + " " + d);
			}
		}
		else {
			double c = matrix[1][2] / matrix[1][1];
			double d = (matrix[0][2] - matrix[0][1]*c)/matrix[0][0];
			System.out.println(c + " " + d);
		}
	}
	public static void main(String[] args) {
		double[][] matrix = new double[2][3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		hptBac1(matrix);
	}

}
