package BTthuc_hanh1;
import java.util.*;
public class bai3 {
	// ax^2 + b*x + c = 0
	public static void ptBac2(int a, int b, int c) {
			if (a == 0) {
				if (b == 0) {
					if (c == 0) {
						System.out.println("vo so nghiem");
					}
					else {
						System.out.println("vo nghiem");
					}
				}
				else {
					System.out.println("Nghiem cua phuong trinh la :" + (double)(-c)/b );
				}
			}
			else {
				double delta = Math.pow(b,2) - 4*a*c;
				if (delta < 0) {
					System.out.println("vo nghiem");
				}
				else if (delta == 0) {
					System.out.println("pt co nghiem duy nhat : " + (double)((-b)/2*a) );
				}
				else {
					System.out.println("Phuong trinh co hai nghiem : " + (double)((-b + Math.sqrt(delta))/(2*a)) + " " + (double)((-b - Math.sqrt(delta))/(2*a)));
				}
			}
			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a ,b, c;
		System.out.println("Nhap a");
		a = sc.nextInt();
		System.out.println("Nhap b");
		b = sc.nextInt();
		System.out.println("Nhap c");
		c = sc.nextInt();
		ptBac2(a, b, c);
	}

}
