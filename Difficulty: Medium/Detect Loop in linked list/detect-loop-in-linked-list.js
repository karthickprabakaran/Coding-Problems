/**
 * @param {Node} head
 * @returns {boolean}
 */

/*
class Node{
    constructor(data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    // Function to check if the linked list has a loop.
    detectLoop(head) {
        // your code here
        let slow = head;
        
        let fast = head;
        
        while( fast !== null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast === slow) return true; 
        }
        
        return false;
    }
}