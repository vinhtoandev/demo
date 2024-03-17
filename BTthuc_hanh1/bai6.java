package BTthuc_hanh1;

import java.util.Scanner;

public class bai6 {
	public static int tinhTien(int begin, int end) {
		int sum = 0;
		while (begin < end) {
			if (begin >= 18) {
				sum += 60000;
			}
			else {
				sum += 45000;
			}
			begin++;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int begin, end;
		begin = sc.nextInt();
		end = sc.nextInt();
		System.out.println(tinhTien(begin, end));
	}

}
