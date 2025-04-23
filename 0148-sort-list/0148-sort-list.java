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

        if(head == null || head.next == null) return head;

        ListNode mid = getMid(head);
        ListNode right = mid.next;
        mid.next = null;

        ListNode left = sortList(head);
        right = sortList(right);

        return merge(left,right);
    }


     private static ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        // Corrected loop to ensure proper mid detection
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private static ListNode merge(ListNode left, ListNode right)
    {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(left != null && right != null)
        {
            if(left.val < right.val)
            {
                temp.next = left;
                temp = temp.next;
                left = left.next;
            }else{
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }
        }

        while(left != null)
        {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while(right != null)
        {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return dummy.next;
    }

}