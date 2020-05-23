package ch03;
import java.util.Scanner;
public class pembagi {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int bil, i;
		System.out.print("masukkan bilangan bulat positif: ");
		bil = sc.nextInt();
		for(i = 4; i<= bil; i++)
			if (bil % i == 0)
			System.out.println(i);
	}
}