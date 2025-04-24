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
    public void reorderList(ListNode head) {

        ListNode mid = getMid(head);

        ListNode secondHead = reverse(mid.next);

        mid.next = null;

        while(head != null && secondHead != null)
        {
            ListNode temp = head.next;
            head.next = secondHead;
            head = temp;

            ListNode temp1 = secondHead.next;
            secondHead.next = head;
            secondHead = temp1;
        }
        
    }

    private static ListNode getMid(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    private static ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode current = head;

        while(current != null)
        {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}