/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function(head, n) {
    let cnt = 0;

  let temp = head;

  while (temp != null) {
    cnt++;
    temp = temp.next;
  }

  if (cnt === n) {
    return head.next;
  }

  let fromFront = cnt - n - 1;

  let trav = head;

  while (fromFront > 0) {
    fromFront--;
    trav = trav.next;
  }

  trav.next = trav.next.next;
  return head;
  
};