class MyCircularQueue {

    int[] arr;
    int cap;
    int currentSize = 0;
    int front;
    int rear;

    public MyCircularQueue(int k) {
        cap = k;
        arr = new int[cap];
        front = 0;
        rear = -1;
    }

    public boolean enQueue(int value) {
        if (arr.length == currentSize) {
            return false;
        }

        rear = (rear + 1) % cap;
        arr[rear] = value;
        currentSize++;
        return true;
    }

    public boolean deQueue() {
        if (currentSize == 0) {
            return false;

        }

        front = (front + 1) % cap;
        currentSize--;

        return true;
    }

    public int Front() {

        if (currentSize != 0) {
            return arr[front];
        }

            return -1;
    }

    public int Rear() {
        if (currentSize == 0) {
            return -1;
        }

        return arr[rear];
    }

    public boolean isEmpty() {
        if (currentSize == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (currentSize == cap) {
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */