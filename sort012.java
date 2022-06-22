import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int c0=0, c1=0, c2=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==0)
                c0++;
            else if(arr[i]==1)
                c1++;
            else if(arr[i]==2)
                c2++;
        }
        int k=0;
        for(int i=0; i<c0; i++)
            arr[k++]=0;
         for(int i=0; i<c1; i++)
            arr[k++]=1;
         for(int i=0; i<c2; i++)
            arr[k++]=2;
        
    }
}
