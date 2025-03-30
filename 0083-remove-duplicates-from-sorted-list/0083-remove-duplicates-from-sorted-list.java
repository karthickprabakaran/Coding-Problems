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
    public ListNode deleteDuplicates(ListNode head) {

        /*
        HashSet<Integer> set = new HashSet<Integer>();
        ListNode temp = head;
        while(temp !=null)
        {
            set.add(temp.val);
            temp = temp.next;
        }
        // now, create an linked list with the values in the hashset and return it 
        ListNode newHead = new ListNode(0);
        ListNode newTemp = newHead;

        for(int val : set)
        {
            newTemp.next = new ListNode(val);
            newTemp = newTemp.next;
        }
        return newHead.next;
        */

        ListNode current = head;
        while(current != null && current.next != null)
        {
            if(current.val == current.next.val)
            {
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return head;
    }
}