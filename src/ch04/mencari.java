package ch04;
import java.util.Scanner;
public class mencari {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		System.out.print("Masukkan nilai yang ingin dicari = ");
        int input = sc.nextInt();
		int hasil = sc.nextInt();
		
		for (int i = 0; i < arrayAngka.length; i++) {
            System.out.print(arrayAngka[i] + ", ");
		}

        if (hasil < 0) {
            System.out.println("Maaf, Nilai tidak ditemukan");
        } else {
            System.out.println("Array dengan nilai " + input + " berada pada indeks ke+"+ hasil);
        }
    }
}