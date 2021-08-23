public class Queue {

    private int maxSize;
    private int size;
    private int front;
    private int rear;
    private Car[] array;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        array = new Car[maxSize];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(Car element) {
        if (size == maxSize) {
            System.out.println("Queue is full");
        } else {
            rear = (rear + 1) % maxSize;
            array[rear] = element;
            size++;
        }
    }

    public Car dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            Car element = array[front];
            front = (front + 1) % maxSize;
            size--;
            element.printCar();
            return element;
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    public void printQueue() {
        System.out.println("Cars in the Queue:");
        for (int i = 0; i < size; i++) {
            array[i].printCar();
        }
    }

}
