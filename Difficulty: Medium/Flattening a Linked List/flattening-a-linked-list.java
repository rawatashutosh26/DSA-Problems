class Solution {
    // Function to flatten a linked list
    Node flatten(Node root) {
        // code here
        if(root == null){
            return null;
        }
        Node curr = root;
        int a = 0;
        while(curr != null){
            Node b = curr;
            while(b != null){
                b = b.bottom;
                a++;
            }
            curr = curr.next;
        }
        curr = root;
        int x = 0;
        int[] arr = new int[a];
        while(curr != null){
            Node b = curr;
            while(b != null){
                arr[x++] = b.data;
                b = b.bottom;
            }
            curr = curr.next;
        }
        Arrays.sort(arr);
        Node newNode = new Node(arr[0]);
        Node curr1 = newNode;
        for(int i= 1; i< a; i++){
            curr1.bottom = new Node(arr[i]);
            curr1 = curr1.bottom;
        }
        return newNode;
    }
}