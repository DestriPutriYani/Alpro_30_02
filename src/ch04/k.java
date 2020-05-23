package ch04;
public class k {
    public static void main(String[] args) {
        int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for (int i = 1; i < arr.length; i++){
            if ( arr[i] > arr[i-1]){
                System.out.println(arr[i-1]);
            }
        }
    }
}
