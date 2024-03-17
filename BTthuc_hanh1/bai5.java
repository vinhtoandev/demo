package BTthuc_hanh1;
import java.util.*;
public class bai5 {
	public static int tg(int a, int b, int c) {
		if (a >= b && a <= c || a >= c && a <=b ) {
			return a;
		}
		else if(b >= a && b <= c || b >= c && b <= a) {
			return b;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println(tg(a,b,c));
	}

}
