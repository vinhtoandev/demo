package BTthuc_hanh1;
import java.util.*;
public class bai10 {
	public static long gt(int n) {
		if (n == 1) return 1;
		return n*gt(n-1);
	}
	public static double pso3(int n) {
		 double s = 1;
		 for (int i = 3; i <= 2*n - 1;i += 2) {
			 s += (double)1/gt(i);
		 }
		 return s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		System.out.println(pso3(n));
	}

}
