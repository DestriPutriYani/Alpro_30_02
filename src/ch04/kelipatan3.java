package ch04;
public class kelipatan3 {
	public static void main(String[]args) {
		int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		for(int a : angka) {
			if(a % 3 == 0) {
				System.out.print(a+"-");
			}
		}
	}
}
		