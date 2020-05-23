import java.util.Scanner;
public class prima {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("masukkan bilangan: ");
		int bilangan = sc.nextInt();
		int bil = 0;
		for (int i = 1; i <= bilangan; i++) {
			if (bilangan%i == 0)
			bil = bil +1; }
		if (bil == 2)
			System.out.println(bilangan + "adalah prima");
		else
			System.out.println(bilangan + "adalah bukan prima");
		}
	}
}