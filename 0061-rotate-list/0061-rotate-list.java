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

    public ListNode rotateRight(ListNode head, int k) {

        //edge case

        if(head == null || head.next == null || k < 1)
        {
            return head;
        }

        //count the length of the linked list

        ListNode temp = head;
        int length = 0;
        while(temp != null)
        {
            length++;
            temp = temp.next;
        }

        //reduce the k
        k = k%length;

        if (k==0) return head;

        //move inside 
        ListNode current = head;
        for(int i=0;i<length -k -1;i++)
        {
            current = current.next;
        }

        //get the new head
        ListNode newHead = current.next;
        //disconnect the tail
        current.next = null;

        

    //get the the last of the new Head
    ListNode last = newHead;
    while(last.next !=null)
    {
        last = last.next;
    }

    //point that to the actual head

    last.next = head;

    return newHead;








        
    }
}