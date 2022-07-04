import java.util.* ;
import java.io.*; 
/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
        LinkedListNode next= head, curr= head;
       LinkedListNode prev= null;
        while(curr!=null)
         {
            next= curr.next;
            curr.next= prev;
            prev= curr;
             curr= next;
        }
        head= prev;
        return head;
    }
}
