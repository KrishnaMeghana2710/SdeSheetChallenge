import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

       class Node 
        { 
        public:
            int data;
            Node next;
            Node(int data) 
            {
              this.data = data;
              this.next = null;
            }
        };

*****************************************************************/

public class Solution {
    public static Node findMiddle(Node head) 
    {
        // Write your code here
        int count=0;
        Node temp= head;
        while(temp.next!=null)
        {
            temp= temp.next;
            count++;
        }
        temp=head;
        
if(count%2==0)
{
    count/=2;
}
        else
        {
            count/=2;
            count++;
            }
        while(count!=0)
        {
            temp= temp.next;
            count--;
        }
        return temp;
    }
}
