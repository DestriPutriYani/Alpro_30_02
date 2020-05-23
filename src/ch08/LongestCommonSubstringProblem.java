package ch08;
public class LongestCommonSubstringProblem {
    static String X, Y;
    static int dna(int a, int b, int count) {

        if (a == 0 || b == 0) {
            return count;
        }
        if (X.charAt(a - 1) == Y.charAt(b - 1)) {
            count = dna(a - 1, b - 1, count + 1);
        }
        count = Math.max(count, Math.max(dna(a, b - 1, 0), dna(a - 1, b, 0)));
        return count;
    }
    public static void main(String[] args){
        int v, w;
        X = "DESTRI";
        Y = "PUTRI";

        v = X.length();
        w = Y.length();
        System.out.println(dna(v, w, 0));
    }
}
