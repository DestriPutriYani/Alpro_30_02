package ch06;
public class Insertionsort {
    private int[] arr;
	public Insertionsort(int n) {
        this.arr = new int[n];
    }
	public void setArr(int index, int value) {
        if (index >= 0 && index < this.arr.length) {
            this.arr[index] = value;
        }
    }
    public void printArr() {
        String out = "Data Array = ";
        for (int x= 0; x <this.arr.length; x++) {
            out += this.arr[x] + ", ";
        }
        System.out.println(out);
    }
    private void Change(int k, int l) {
        int temp = this.arr[k];
        this.arr[k] = this.arr[l];
        this.arr[l] = temp;
    }
    public void Sort() {
        for (int x = 1; x < this.arr.length; x++) {
            int y = x;
            while (y >0 && this.arr[y] < this.arr[y - 1]) {
                Change(y,y-1);
                y--;
            }
        }
    }
    public static void main(String[] args) {
        Insertionsort is = new Insertionsort(13);

//        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        is.setArr(0, 82);
        is.setArr(1, 12);
        is.setArr(2, 41);
        is.setArr(3, 38);
        is.setArr(4, 19);
        is.setArr(5, 26);
        is.setArr(6, 9);
        is.setArr(7, 48);
        is.setArr(8, 20);
        is.setArr(9, 55);
        is.setArr(10, 8);
        is.setArr(11, 32);
        is.setArr(12, 3);

        is.printArr();
        is.Sort();
        is.printArr();
    }
}


