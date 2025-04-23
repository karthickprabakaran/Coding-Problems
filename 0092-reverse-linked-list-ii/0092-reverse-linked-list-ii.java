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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode prev = null;
        ListNode current = head;

        for(int i=1;i<left;i++)
        {
            prev = current;
            current = current.next;
        }

        ListNode last  = prev;
        ListNode newEnd = current;

        for(int i=0;i<right-left +1;i++)
        {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        if(last == null)
        {
            head = prev;
        }else{
            last.next = prev;
        }

        newEnd.next = current;

        return head;
        
    }
}