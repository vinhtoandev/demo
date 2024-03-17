package BTthuc_hanh1;
import java.util.*;
public class bai15 {
	public static boolean isChinhPhuong(int n) {
		int tam = (int)Math.sqrt(n);
		if (Math.pow(tam, 2) == n) return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		System.out.println(isChinhPhuong(n));
	}

}
