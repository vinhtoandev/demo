package BTthuc_hanh1;
import java.util.*;
public class bai11 {
	public static long gt2(int n) {
		long s = 1;
		if (n % 2 == 0) {
			for (int i = 2; i <= n; i+=2) {
				s*=i;
			}
			return s;
		}
		for (int i = 3;i <= n;i+=2) {
			s*=i;
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		System.out.println(gt2(n));
	}

}
