/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode mid = getMid(head);

        ListNode right = mid.next;
        mid.next = null;

        ListNode left = sortList(head);
        right = sortList(right);

        return merge(left, right);        
        
    }

    private ListNode merge(ListNode first, ListNode second)
    {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(first != null && second !=null)
        {
            if(first.val < second.val)
            {
                temp.next = first;
                first = first.next;
            }else{
                temp.next = second;
                second = second.next;
            }
            temp = temp.next;
        }

        if(first != null)
        {
            temp.next = first;
        }else{
            temp.next = second;
        }

        return dummy.next;
    }
    
    private ListNode getMid(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}