package ch09;
import java.util.Scanner;
public class  SieveOfAtkin{
    private boolean[] calcPrimes(int limit) {
        boolean[] prima = new boolean[limit + 1];
        prima[2] = true;
        prima[3] = true;
        int root = (int) Math.ceil(Math.sqrt(limit));
        for (int x = 1; x < root; x++) {
            for (int y = 1; y < root; y++){
                int n = 4 * x * x + y * y;
                if (n <= limit && (n % 12 == 1 || n % 12 == 5))
                    prima[n] = !prima[n];
                n = 3 * x * x + y * y;
                if (n <= limit && n % 12 == 7)
                    prima[n] = !prima[n];
                n = 3 * x * x - y * y;
                if ((x > y) && (n <= limit) && (n % 12 == 11))
                    prima[n] = !prima[n];
            }
        }
        for (int i = 5; i <= root; i++)
            if (prima[i])
                for (int j = i * i; j < limit; j += i * i)
                    prima[j] = false;
 
        return prima;
    }
    public void getbil(int N){
        boolean[] bil = calcPrimes(N);
        display(bil);
    }
    public void display(boolean[] bil) {
        System.out.print("\nPrima = ");
        for (int i = 2; i < bil.length; i++)
            if (bil[i])
                System.out.print(i +" ");
        System.out.println();
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sieve Of Atkin Prima Algorithm Test\n");
		 SieveOfAtkin soa = new  SieveOfAtkin();
        System.out.println("Masukkan angka untuk menemukan prima\n");
        int n = scan.nextInt();
        soa.getbil(n);        
    }
}