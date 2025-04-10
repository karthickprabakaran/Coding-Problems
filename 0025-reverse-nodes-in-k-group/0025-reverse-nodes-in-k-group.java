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
    public ListNode reverseKGroup(ListNode head, int k) {

        if(k <= 1 || head == null) return head;

        ListNode current = head;
        ListNode prev = null;
        ListNode temp = head;

        while(true)
        {
            int cnt = 0;

            while(temp != null && cnt < k)
            {
                temp = temp.next;
                cnt++;
            }
        if(cnt < k) break;

            ListNode last = prev;
            ListNode newEnd = current;

            for(int i=0;i<k && current != null;i++)
            {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            if(last != null)
            {
                last.next = prev;
            }else{
                head = prev;
            }


            newEnd.next = current;
            prev = newEnd;

            if(current == null) break;
        }

        return head;
        
    }
}