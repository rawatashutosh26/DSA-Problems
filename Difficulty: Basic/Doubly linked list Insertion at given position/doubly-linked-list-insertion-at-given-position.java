/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/

class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
        Node newNode = new Node(x);
        Node curr = head;
        for(int i = 0; i < p; i++){
            curr= curr.next;
        }
        newNode.next = curr.next;
        newNode.prev = curr;
        
        if(curr.next != null){
            curr.next.prev = newNode;
        }
        
        curr.next = newNode;
        return head;
    }
}