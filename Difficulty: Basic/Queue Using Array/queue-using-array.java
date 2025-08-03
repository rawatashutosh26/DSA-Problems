class MyQueue {
    int front, rear, size;
    int arr[] = new int[100005];

    MyQueue() {
        front = 0;
        rear = 0;
        size = 0;
    }

    // Function to push an element x in a queue.
    void push(int x) {
        arr[rear] = x;
        rear = (rear + 1) % arr.length; // Wrap around
        size++;
    }

    // Function to pop an element from queue and return that element.
    int pop() {
        if (size == 0) {
            return -1; // Return -1 if the queue is empty
        }
        int poppedElement = arr[front];
        front = (front + 1) % arr.length; // Wrap around
        size--;
        return poppedElement;
    }

    // Function to check if the queue is empty.
    boolean isEmpty() {
        return size == 0;
    }

    // Function to get the size of the queue.
    int getSize() {
        return size;
    }
}
