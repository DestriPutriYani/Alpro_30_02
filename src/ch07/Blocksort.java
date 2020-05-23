package ch07;
public class Blocksort {
    private Blocksort(int[] arr) {
        int n = arr.length;
        for (int a = 1;a<n;a++) {
            int key = arr [a];
            int b=a-1;
            while ((b>-1)&&(arr[b]>key)){
                arr[b+1] = arr[b];
                b--;
            }
            arr[b+1]=key;
        }
    }
    private int[] arr;

    public static void main(String[] args) {
        int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Sebelum diurutkan block sort");
        for (int b:arr){
            System.out.print(b+" ");
        }
        System.out.println();
        new Blocksort(arr);

        System.out.println("Setelah block sort");
        for(int b:arr){
            System.out.print(b+" ");
        }
    }
}
