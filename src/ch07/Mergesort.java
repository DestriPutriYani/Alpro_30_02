package ch07;
public class Mergesort {
    public static void main(String arr[]) {

     int d[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
     System.out.println("Sebelum diUrutkan merge sort ");
     for(int a = 0; a < d.length; a++)   {
        System.out.print(d[a]+" ");
     }
     System.out.println();
      
     initializemergeSort(d,0,d.length-1);
     System.out.println();   
     System.out.println("Setelah diUrutkan merge sort ");
     for(int a = 0; a < d.length; a++)
     {
        System.out.print(d[a]+" ");
     }

}
   public static void initializemergeSort(int d[], int e, int s) { 
     int low = e;
     int high = s;
     if (low>=high)     {
        return;
     }
     int middle=(low+high)/2;
     initializemergeSort(d,low,middle);
     initializemergeSort(d,middle+1,high);
     int end_low=middle;
     int start_high=middle+1;
     while ((e<=end_low) && (start_high<=high))   {
        if (d[low]<d[start_high])     {
           low++;
        }
        else     {
           int Temp=d[start_high];
           for (int b=start_high-1;b>=low;b--)         {
              d[b+1]=d[b];
           }
           d[low]=Temp;
           low++;
           end_low++;
           start_high++;
      }
    }
  }  
} 

