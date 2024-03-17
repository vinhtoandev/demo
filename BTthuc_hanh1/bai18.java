package BTthuc_hanh1;

public class bai18 {
	public static boolean isSohh(int n) {
		int s = 0;
		for (int i = 1 ;i < n ;i++) {
			if (n % i == 0) s+=i;
		}
		return s == n;
	}
	public static void inSohh() {
		for (int i = 6; i <= 1000 ;i++) {
			if(isSohh(i)) System.out.println(i);
		}
	}
	public static void main(String[] args) {
		inSohh();

	}

}
