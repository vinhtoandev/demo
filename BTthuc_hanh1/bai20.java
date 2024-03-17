package BTthuc_hanh1;
import java.util.*;
public class bai20 {

	public static int isFibonaci(int n) {
		if (n == 1) return 1;
		if (n == 2) return 2;
		int t1 = 1, t2 = 1, t = t1 + t2;
		int index  = 3;
		while (t <= n) {
			if (n == t) return index;
			else {
				t1 = t2;
				t2 = t;
				t = t1 + t2;
				index ++;
			}
		}
		return -1;
	}
	
	public static void main(String[] str) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		if (isFibonaci(n) > 0) {
			System.out.println(n + " La so fibonaci thu " + isFibonaci(n));
		}
		else {
			System.out.println("khong phai");
		}
	}

}
