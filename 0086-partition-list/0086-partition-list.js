/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} x
 * @return {ListNode}
 */
var partition = function(head, x) {
    
    let left = new ListNode(0);
    let newStart = left;
    let right = new ListNode(0);
    let newEnd = right;

    let temp = head;

    while(temp != null ){
        if(temp.val < x){
            left.next = temp;
            left = left.next;
        }else{
            right.next = temp;
            right = right.next;
        }
        temp = temp.next;
    }

    right.next = null;
    left.next  = newEnd.next;

    return newStart.next;
    
    
    };