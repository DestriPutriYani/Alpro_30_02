package ch04;
public class kelipatan5 {
	public static void main(String[]args) {
		int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		        for (int i = 0; i < angka.length; i++) {
				if(angka[i] % 5 == 0 && angka [i+1] %5 == 0) {
				System.out.println(angka [i]);
				System.out.println(angka [i+1]);
			}
		}
	}
}