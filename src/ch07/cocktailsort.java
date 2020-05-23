package ch07;
import java.util.Arrays;

public class cocktailsort {
    void cocktailsort(int no[]){
    boolean swapped;
	do {
        swapped = false;
            for (int a =0; a<=  no.length  - 2;a++) {
		if (no[ a ] > no[ a + 1 ]) {
		int temp = no[a];
		no[a] = no[a+1];
		no[a+1]=temp;
		swapped = true;
			}
		}
		if (!swapped) {
			break;
		}
		swapped = false;
		for (int a= no.length - 2;a>=0;a--) {
                    if (no[ a] > no[ a + 1 ]) {
			int temp = no[a];
			no[a] = no[a+1];
			no[a+1]=temp;
			swapped = true;
			}
		}
}       while (swapped);
}
    public static void main(String args[])
    {
        cocktailsort ob = new cocktailsort();
        int no[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("array sebelum:");
        System.out.println(Arrays.toString(no));
        ob.cocktailsort(no);
        System.out.println("array sesudah");
        System.out.println(Arrays.toString(no));
    }
}
