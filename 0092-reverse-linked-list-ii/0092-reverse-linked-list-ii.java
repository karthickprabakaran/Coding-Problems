class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) return head;

        ListNode prev = null;
        ListNode current = head;

        // Move `current` to the `left` position, and track `prev`
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;
        ListNode next = null;

        // Reverse the sublist from left to right
        for (int i = 0; current != null && i < right - left + 1; i++) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Reconnect with the rest of the list
        if (last != null) {
            last.next = prev;
        } else {
            head = prev; // when reversing from the first node
        }

        newEnd.next = current;

        return head;
    }
}