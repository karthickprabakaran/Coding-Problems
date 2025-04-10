class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Step 1: Find the middle
        ListNode mid = getMid(head);

        // Step 2: Reverse the second half
        ListNode secondHead = reverse(mid.next);
        mid.next = null; // Important: split the list into two halves

        // Step 3: Merge the two halves
        while (head != null && secondHead != null) {
            ListNode temp = head.next;
            head.next = secondHead;
            head = temp;

            temp = secondHead.next;
            secondHead.next = head;
            secondHead = temp;
        }
        if(head != null) head=null;
    }

    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}