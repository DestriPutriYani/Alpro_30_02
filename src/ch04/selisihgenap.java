package ch04;
public class selisihgenap {
	public static void main(String[]args) {
		int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		for(int i = 0; i < angka.length; i++) {
			if(angka[i] %2 == 0 && angka [i+1] %2 == 0) {
				int jumlah = angka[i] - angka[i+1];
				System.out.println(angka[i] + "-"+ angka[i+1] + "="+ jumlah);
			}
		}
	}
}