/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 
 */
 public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        if (head == null || head.next == null) return null; // No cycle possible if there's 0 or 1 node

        // Step 1: Detect the cycle using Floyd's Tortoise and Hare algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If fast and slow meet, we have found a cycle
            if (fast == slow) {
                // Step 2: Find the cycle's starting point
                // To find the cycle start, reset one pointer to head
                ListNode temp = head;
                while (temp != slow) {
                    temp = temp.next;
                    slow = slow.next;
                }
                return temp; // When they meet, temp is at the start of the cycle
            }
        }

        // No cycle found
        return null;
    }
}