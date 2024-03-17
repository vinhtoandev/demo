package BTthuc_hanh1;
import java.util.*;
public class bai13 {
	public static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b ,a%b);
	}
	public static int lcm(int a, int b) {
		return (a*b)/gcd(a,b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(gcd(a,b));
		System.out.println(lcm(a,b));
	}

}
