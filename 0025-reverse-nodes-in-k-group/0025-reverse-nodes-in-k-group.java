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

        ListNode prev = null;
        ListNode current = head;

        while(true)
        {

            ListNode last = prev;
            ListNode newEnd = current;
            ListNode temp = current;
            int cnt = 0;
            while(temp != null)
            {
                cnt++;
                temp = temp.next;
            }

            if(cnt < k) break;

            

            for(int i=0;i<k;i++)
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

            prev = newEnd;

            if(current == null) return head;
         }
        return head;
    }
}