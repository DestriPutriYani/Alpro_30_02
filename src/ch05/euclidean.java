package ch05;
import java.util.Scanner;
public class euclidean {
    public static void main(String[]args) {
        int m, n, r;
        Scanner scn = new Scanner(System.in);
        
        System.out.print("m : ");
        m = scn.nextInt();
        
        System.out.print("n : ");
        n = scn.nextInt();
        
        r = m % n;
        while (r != 0 ) {
            m = n;
            n = r;
            r = m %n;
        }
        System.out.println("FPB = " + n);
    }
}