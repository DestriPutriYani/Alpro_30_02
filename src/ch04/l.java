package ch04;
public class l {
    public static void main(String[] args) {
        int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int i = 1;
        do{
            if (arr[i] % 2 == 0 && arr [i-1] %2 == 0) {
                System.out.print( arr[i-1] + "+" + arr[i] + "=");
                System.out.println(arr[i-1] + arr[i] + "");
            }
            i++;
            } while (i < arr.length) ;
        }
    }