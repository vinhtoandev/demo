package BTthuc_hanh1;
import java.util.*;
public class bai9 {
	public static long gt(int n) {
		if (n == 1) return 1;
		return n*gt(n-1);
	}
	public static double pso2(int n) {
		double s = 15;
		for (int i = 1; i <= n; i++) {
			s += (double)Math.pow(-1,i)/gt(i);
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		System.out.println(pso2(n));
	}

}
