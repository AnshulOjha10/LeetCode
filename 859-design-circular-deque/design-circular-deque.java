class MyCircularDeque {

    int[] arr;
    int front = 0;
    int rear;
    int cap;
    int size = 0;

    public MyCircularDeque(int k) {
        arr = new int[k];
        cap = k;
        rear = k - 1;
    }

    public boolean insertFront(int value) {

        if (size == cap) {
            return false;
        }

        front = (front - 1 + cap) % cap;
        arr[front] = value;
        size++;
        return true;

    }

    public boolean insertLast(int value) {

        if (size == cap) {
            return false;
        }
        rear = (rear + 1) % cap;
        arr[rear] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (size == 0) {
            return false;
        }

        front = (front + 1) % cap;
        size--;
        return true;

    }

    public boolean deleteLast() {
        if (size == 0) {
            return false;
        }

        rear = (rear - 1 + cap) % cap;
        size--;
        return true;
    }

    public int getFront() {
        if (size == 0) {
            return -1;
        }

        return arr[front];
    }

    public int getRear() {
        if (size == 0) {
            return -1;
        }

        return arr[rear];
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if(size == cap){
            return true;
        }

        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */