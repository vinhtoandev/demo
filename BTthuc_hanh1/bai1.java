package BTthuc_hanh1;
import java.util.Scanner;
public class bai1 {
	public static int max(int a, int b, int c) {
		if (a >= b) {
			if(a>=c) return a;
			return c;
		}
		else {
			if (b >= c) return b;
			return c;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(max(a,b,c));
	}

}
