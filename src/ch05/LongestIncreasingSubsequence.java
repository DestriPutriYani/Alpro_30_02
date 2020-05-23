package ch05;
public class LongestIncreasingSubsequence {
    static int max_ref;
    static int _lis(int arr[], int x)
    {
        if (x == 1)
            return 1;
        int res, max_ending_here = 1;
        for (int a = 1; a < x; a++) {
            res = _lis(arr, a);
            if (arr[a - 1] < arr[x - 1] && res + 1 > max_ending_here)
                max_ending_here = res + 1;
        }
        if (max_ref < max_ending_here)
            max_ref = max_ending_here;
        return max_ending_here;
    }
    static int lis(int arr[], int x)
    {
        max_ref = 1;
        _lis(arr, x);
        return max_ref;
    }
    public static void main(String args[])
    {
        int arr[] = { 82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3 };
        int x = arr.length;
        System.out.println("Panjang : " + lis(arr, x) + "\n");
    }
}
