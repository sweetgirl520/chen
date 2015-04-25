/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
    if(head==null) return null;
    ListNode foreHead=new ListNode(0);
    
    foreHead.next=head;
    ListNode pre=foreHead;
    ListNode curr=head;
    
    
    while(curr!=null)
    {
        if(curr.val==val)
        {
            curr=curr.next;
            pre.next=curr;
        }
        else
        {
            pre=pre.next;
            curr=curr.next;
        }
    }
    return foreHead.next;
    
    
	
		
        
    }
}