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

        if(head == null || head.next == null || k <1 )
        {
            return head;
        }

        //find the length of the linked list

        ListNode temp = head;
        int length = 1;
        while(temp.next != null)
        {
            length++;
            temp = temp.next;
        }

        //reduce the k and handle the edge case

        k = k%length;

        if(k == 0) return head;

        //move to the length before the linked list

        ListNode tem = head;

        for(int i=0;i< length - k -1; i++)
        {
            tem = tem.next;
        }

        ListNode newHead = tem.next;

        tem.next = null;

        //find the last and connect to the head

        temp.next = head;

        return newHead;



        
    }
}