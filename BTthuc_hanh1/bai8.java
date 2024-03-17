package BTthuc_hanh1;
import java.util.*;
public class bai8 {
	public static double pso(int n) {
		double sum = 1;
		for (int i = 2; i <= n; i++) {
			sum += (double)1/i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(pso(n));
	}
}
