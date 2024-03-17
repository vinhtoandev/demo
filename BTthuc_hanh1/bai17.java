package BTthuc_hanh1;
import java.util.*;
public class bai17 {
	public static boolean isNt(int n) {
		if (n <= 1) return false;
		if (n == 2) return true;
		for (int i = 2; i <= Math.sqrt(n);i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
	public static void inNt(int n) {
		for (int i = 2; i <= n ;i++) {
			if (isNt(i)) {
				System.out.println(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		inNt(n);

	}

}
