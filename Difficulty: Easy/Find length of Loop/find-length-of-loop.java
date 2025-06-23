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
        Node curr = head;
        HashSet<Node> set = new HashSet<>();
        while(curr != null){
            if(set.contains(curr)){
                Node start = curr;
                int a = 1;
                Node end = start.next;
                while(end != start){
                    a++;
                    end = end.next;
                }
                return a;
            }
            set.add(curr);
            curr = curr.next;
        }
        return 0;
        
    }
}