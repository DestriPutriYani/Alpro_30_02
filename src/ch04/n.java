package ch04;
public class n {
    public static void main(String[] args) {
        int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int hasil = 0;
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " + seluruh angka sebelumnya = ");
            System.out.println(arr[i] + hasil);
            hasil = hasil + arr[i];
        }
    }
}
