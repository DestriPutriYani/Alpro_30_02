package ch03;
import java.util.Scanner;
public class nilaiXY {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		System.out.println("masukkan nilai x:");
		x = sc.nextInt();
		System.out.println("masukkan nilai y:");
		y = sc.nextInt();
		if (x > y) {
			System.out.println("nilai max adalah " +x);
		}
		else if (x < y) {
			System.out.println("nilai max adalah " +y);
		}
		else {
		System.out.println("masukkan nilai ulang");
		}
	}
}