//61. Rotate List



package Solutions;

public class RotateRight {

	public ListNode rotateRight(ListNode head, int k)
    {
    
        int len = 0;
        ListNode lenHead = head;
        if(head == null || head.next == null) return head;
        while(lenHead.next != null)
        {
            len++;
            lenHead = lenHead.next;
        }
        len++;
        if(k > len) k = k % len;
        if(k == 0 || k == len) return head;

        ListNode end = head;
        int count = len - k -1;
        while(count != 0)
        {
            end = end.next; count--;
        }
        
        ListNode newHead = end.next;
        end.next = null;
        
        lenHead.next = head;
        
        return newHead;
        
        
    }
	
	
}
