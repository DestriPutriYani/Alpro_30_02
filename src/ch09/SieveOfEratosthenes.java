package ch09;
import java.util.Scanner;
public class SieveOfEratosthenes	{
    private int[] calcPrimes(int N) {
        int[] arr = new int[N + 1];
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (arr[i] == 0) {
                for (int j = i * i; j <= N; j += i) {
                    arr[j] = 1;
                }
            }
        }
        return arr;
    }
    public void getPrimes(int N){
        int[] primes = calcPrimes(N);
        display(primes);
    }
    public void display(int[] primes){
        System.out.print("\nPrima = ");
        for (int i = 2; i < primes.length; i++)
            if (primes[i] == 0)
                System.out.print(i +" ");
        System.out.println();
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sieve Of Eratosthenes Prima Algorithm Test\n");
        SieveOfEratosthenes soe = new SieveOfEratosthenes();
        System.out.println("Masukkan angka untuk bilangan prima\n");
        int n = scan.nextInt();
        soe.getPrimes(n);        
    }
}