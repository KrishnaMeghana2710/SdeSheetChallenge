import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
        int count=0,cand=-1;
        for(int num: arr)
        {
            if(count==0)
            {
                cand= num;
                count=1;
            }
            if(num==cand)
                count++;
            else 
                count--;
        }
        count=0;
        for(int num: arr)
        {
            if(num==cand)
                count++;
        }
       if(count>(n/2))
           return cand;
        return -1;
        
           
	}
}
