/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // code here.
        
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow){
                Node temp = slow;
                int cnt = 0;
                do{
                    slow = slow.next;
                    cnt++;
                }while(fast != slow);
                return cnt;
            }
        }
        
        return 0;
    }
}