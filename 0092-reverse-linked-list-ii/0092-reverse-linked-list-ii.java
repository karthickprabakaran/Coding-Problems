class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode leftPrev = dummy;

        // Move leftPrev to the node just before `left`
        for (int i = 1; i < left; i++) {
            leftPrev = leftPrev.next;
        }

        ListNode current = leftPrev.next;
        ListNode prev = null;

        // Reverse the sublist from left to right
        for (int i = 0; i <= right - left; i++) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }

        // Connect the reversed sublist back
        leftPrev.next.next = current; // original start of sublist is now the tail
        leftPrev.next = prev; // prev is the new head of reversed sublist

        return dummy.next;
    }
}