import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
       Map<Integer, Integer> mp= new HashMap<Integer, Integer>();
        for(int i: arr)
        {
            if(mp.containsKey(i))
             mp.put(i, mp.get(i)+1);
            else
                mp.put(i, 1);
        }
        for(int i: mp.keySet())
        {
            if(mp.get(i)!=1)
                return i;
         }
        return 1;
    }
}
