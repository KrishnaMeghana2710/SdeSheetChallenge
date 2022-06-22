import java.util.*;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n)
    {
		// Write your code here.
        ArrayList<Integer> newList = new ArrayList<Integer>();
        int count=0;
        for(int i: arr)
        {
            if(!newList.contains(i))
            {
                newList.add(i);
                count++;
            }
           
        }
        return count;
        
	}
}
