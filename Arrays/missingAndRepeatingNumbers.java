import java.util.*;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int sum= 0;
        int temp= n;
        while(temp!=0)
        {
            sum+=temp;
            temp--;
        }
        temp=0;
        int extra= 0;
        Map<Integer, Integer> mp= new HashMap<Integer, Integer>();
        for(int num: arr)
        {
            if(mp.containsKey(num))
            {
                mp.put(num, mp.get(num)+1);
                extra= num;
            }
            else
                mp.put(num, 1);
            temp+= num;
        }
            temp= temp-extra;
            temp= sum-temp;
        int[] a= new int[2];
        a[0]= temp;
        a[1]= extra;
        return a;
    }
}
