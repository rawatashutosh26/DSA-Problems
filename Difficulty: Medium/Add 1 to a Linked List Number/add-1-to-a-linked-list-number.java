/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        // code here.
        if(head == null){
            return null;
        }
        if(head.next == null){
            Node curr = head;
            curr.data = curr.data + 1;
            return curr;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        
        if(curr.data < 9){
            curr.data = curr.data + 1;
        }else{
            gostepback(curr, head);
        }
        return head;
    }
    public Node gostepback(Node curr1, Node head){
        Node curr = head;
        if(curr == curr1){
            curr.data = curr.data + 1;
            return head;
        }
        while(curr.next != curr1){
            curr = curr.next;
        }
        if(curr.data < 9){
            curr.data = curr.data + 1;
            curr1.data = 0;
        }else{
            curr1.data = 0;
            gostepback(curr, head);
        }
        return head;
    }
}