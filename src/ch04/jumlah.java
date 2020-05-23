package ch04;
public class jumlah {
	public static void main(String[]args) {
		int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		int jumlah = 0;
		for(int i = 0; i < angka.length; i++) {
			jumlah = jumlah +angka[i];
		}
		System.out.println(jumlah);
	}
}