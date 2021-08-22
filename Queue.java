public class Queue {

    private int maxSize;
    private int size;
    private int front;
    private int rear;
    private int[] array;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void push(int element) {
        if (size == maxSize) {
            System.out.println("Queue is full");
        } else {
            rear = (rear + 1) % maxSize;
            array[rear] = element;
            size++;
        }
    }

    public int pop() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            int element = array[front];
            front = (front + 1) % maxSize;
            size--;
            return element;
        }
        return 0;
    }

    public int getSize() {
        return size;
    }

}
