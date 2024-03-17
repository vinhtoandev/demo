package BTthuc_hanh1;
import java.util.*;
public class bai16 {
	public static boolean dx(int n) {
		String s = Integer.toString(n);
		int i = 0, j = s.length() - 1;
		while(i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		System.out.println(dx(n));

	}

}
