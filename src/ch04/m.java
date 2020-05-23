package ch04;
public class m {
    public static void main(String[] args) {
        int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		int selisih, hasil = 0;
        System.out.print("jumlah angka selisih point i = ");
        for (int i = 1; i < arr.length; i++){
            selisih = arr[i-1] - arr[i];
            hasil += selisih;
        }
        System.out.println(hasil);
    }
}
