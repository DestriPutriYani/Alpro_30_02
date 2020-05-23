package ch04;
public class angka2 {
	public static void main(String[]args) {
		int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		        for (int i = 0; i < angka.length; i++) {
            if (String.valueOf(angka[i]).contains("2")){
                System.out.print( angka[i] + ", ");
            }
        }
    }
}