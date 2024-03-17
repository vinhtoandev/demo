package BTthuc_hanh1;
import java.util.*;
public class bai19 {
	public static void Fibonaci(int n) {
		if (n == 1) {
			System.out.print("1");
		}
		else if (n == 2) {
			System.out.print("1 1");
		}
		System.out.print("1 1");
		int n1 = 1, n2 = 1, t;
		for (int i = 3;i <= n ;i++) {
			t = n1 + n2;
			System.out.print(" " + t);
			n1 = n2;
			n2 = t;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		Fibonaci(n);
	}

}
