/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var sortList = function(head) {


    if (!head || !head.next) return head;

    let mid = getMid(head);
    let secondHead = mid.next;
    mid.next = null;

    let left = sortList(head);
    let right = sortList(secondHead);

    return merge(left, right);
    
};


function getMid(head) {
    let slow = head;
    let fast = head;
    let prev = null;

    while (fast && fast.next) {
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
    }

    return prev;
}

function merge(left, right){
    let temp = new ListNode(-1);
    let dummy = temp;

    while(left != null && right != null){
        if(left.val < right.val){
            dummy.next = left;
            left = left.next;
        }else{
            dummy.next = right;
            right = right.next;
        }
        dummy = dummy.next;
    }

    dummy.next = left || right;



    return temp.next;
}