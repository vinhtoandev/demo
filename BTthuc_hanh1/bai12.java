package BTthuc_hanh1;

import java.util.Scanner;

public class bai12 {
	public static int tong(int n) {
		int s = 0;
		while(n != 0) {
			s += n%10;
			n/=10;
		}
		return s;
	}
	public static int tich(int n) {
		int s = 1;
		while(n != 0) {
			s *= n%10;
			n/=10;
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		System.out.println(tong(n));
		System.out.println(tich(n));
	}

}
