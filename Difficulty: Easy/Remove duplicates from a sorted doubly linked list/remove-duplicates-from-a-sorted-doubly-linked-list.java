// User function Template for Java

class Solution {
    Node removeDuplicates(Node head) {
        if (head == null) {
            return null;
        }

        Node curr = head;

        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                Node nextNode = curr.next.next;
                curr.next = nextNode;
                if (nextNode != null) {
                    nextNode.prev = curr;
                }
            } else {
                curr = curr.next;
            }
        }

        return head;
    }
}
