package BTthuc_hanh1;
import java.util.*;
public class bai2 {
	public static void ptbac1(int a, int b) {
		// ax + b = 0
		if (a == 0) {
			if (b == 0) {
				System.out.println("vo so nghiem");
			}
			else {
				System.out.println("vo nghiem");
			}
		}
		else {
			System.out.println("Nghiem cua phuong trinh la :" + (double)(-b)/a );
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Nhap a: ");
		a = sc.nextInt();
		System.out.println("Nhap b");
		b = sc.nextInt();
		ptbac1(a,b);
	}

}
