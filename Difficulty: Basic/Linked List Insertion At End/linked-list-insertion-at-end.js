/**
 * @param {Node} head
 * @param {number} newData
 * @returns {Node}

/*
class Node{
    constructor(data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    insertAtEnd(head, x) {
        // code here
        let temp = head;
        
        if(temp == null){
            return new Node(x);
        }
        
        while(temp.next !== null){
            temp = temp.next;
        }
        
        let newNode = new Node(x);
        
        temp.next = newNode;
        
        return head;
    }
}