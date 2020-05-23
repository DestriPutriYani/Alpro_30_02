package ch09;
import java.util.Scanner;
public class  SieveOfSundaram	{
    private boolean[] calcPrimes(int limit) {
        int n = limit/2;
        boolean[] prima = new boolean[limit];        
        for (int a = 1; a < n; a++)
            for (int j = a; j <= (n - a) / (2 * a + 1); j++)
                prima[a + j + 2 * a * j] = true;
 
        return prima;
    }
    public void getPrimes(int N){
        boolean[] primes = calcPrimes(N);
        display(primes);
    }
    public void display(boolean[] primes){
        System.out.print("\nPrima = 2 3 ");
        for (int a = 2; a < primes.length/2; a++)
            if (!primes[a])
                System.out.print((2 * a + 1) +" ");
        System.out.println();
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sieve Of Sundaram Prima Algorithm Test\n");
         SieveOfSundaram sos = new  SieveOfSundaram();
        System.out.println("Masukkan angka untuk bilangan prima\n");
        int n = scan.nextInt();
        sos.getPrimes(n);        
    }
}