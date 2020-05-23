package ch06;
public class Bubblesort {

    static void Bubblesort(int[] arr) {
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b <arr.length - 1; b++) {
                if (arr[b] > arr[b + 1]) {
                    int temp = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + ", ");
        }
        System.out.println("");
        Bubblesort(arr);
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + ", ");
        }
    }
}
