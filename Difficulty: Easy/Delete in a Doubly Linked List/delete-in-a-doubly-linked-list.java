/*

Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        Node curr = head;
        int a = 1;
        while(a < x && curr != null){
            a++;
            curr = curr.next;
        }
        if(curr == head){
            head = head.next;
            if(head != null){
                head.prev = null;
            }
        }else{
            if(curr.prev != null){
                curr.prev.next = curr.next;
            }
            if(curr.next != null){
                curr.next.prev = curr.prev;
            }
            
        }
        return head;
    }
}