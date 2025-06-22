// User function Template for Java

/* Node of a linked list
  class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        
        Node curr = head;
        while(curr.next != null){
            if(curr.data == key){
                return true;
            }
            curr = curr.next;
            if(curr.data == key){
                return true;
            }
        }
        return false;
    }
}