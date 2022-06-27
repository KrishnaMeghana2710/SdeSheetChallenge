import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        Set<Integer> row= new HashSet<Integer>();
        Set<Integer> col= new HashSet<Integer>();
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
            {
                if(matrix[i][j]==0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(row.contains(i) || col.contains(j))
                {
                    matrix[i][j]=0;
                }
            }
        }
       
    }
}
