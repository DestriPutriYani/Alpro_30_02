package ch08;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class KnuthMorrisPratt {
    private final int[] failure;
    public KnuthMorrisPratt(String text, String patt) {
        failure = new int[patt.length()];
        fail(patt);
        int tes = posMatch(text, patt);
        if (tes == -1)
            System.out.println("\nTidak di Temukan Kecocokan");
        else
            System.out.println("\nKecocokan di Temukan Pada Index ke- "+ tes);
    }
    private void fail(String patt) {
        int n = patt.length();
        failure[0] = -1;
        for (int j = 1; j < n; j++) {
            int i = failure[j - 1];
            while ((patt.charAt(j) != patt.charAt(i + 1)) && i >= 0)
                i = failure[i];
            if (patt.charAt(j) == patt.charAt(i + 1))
                failure[j] = i + 1;
            else
                failure[j] = -1;
        }
    }
    private int posMatch(String text, String patt){
        int i = 0, j = 0;
        int lens = text.length();
        int lenp = patt.length();
        while (i < lens && j < lenp) {
            if (text.charAt(i) == patt.charAt(j))
            {
                i++;
                j++;
            }
            else if (j == 0)
                i++;
            else
                j = failure[j - 1] + 1;
        }
        return ((j == lenp) ? (i - lenp) : -1);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Mencoba Knuth Morris Pratt\n");
        System.out.println("\nMasukkan Teks\n");
        String text = br.readLine();
        System.out.println("\nMasukkan kata\n");
        String kata = br.readLine();
        KnuthMorrisPratt kmp = new KnuthMorrisPratt(text, kata);
    }
}
