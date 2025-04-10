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
    public boolean isPalindrome(ListNode head) {

        ListNode mid = getmid(head);
        ListNode secondhead = reverse(mid);
        ListNode reverseHead = secondhead;

        while(head != null && secondhead != null)
        {
            if(head.val != secondhead.val ) break;
            head = head.next;
            secondhead = secondhead.next;
        }

        if(secondhead == null) return true;

        reverse(reverseHead);

        return false;

    }

        private ListNode reverse(ListNode head)
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

        private ListNode getmid(ListNode head)
        {
            ListNode slow = head;
            ListNode fast = head;

            while(fast != null && fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }
}