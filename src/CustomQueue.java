public class CustomQueue {
    int[] data;
    private static int DEFAULT_SIZE = 10;

    //Here in queues ptr is known as the end and all the operation take place on or with the help of end
    int ptr = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int [size];
    }

    //To check whether the queue is full or not.
    public boolean isFull(){
        return ptr == data.length;
    }

    //To check whether the queue is empty or not.
    public boolean isEmpty(){
        return ptr == 0;
    }

    //Function to insert an item (In queue, insertion or pushing an item takes place from the first)
    public boolean insert(int item){
        if (isFull()){
            System.out.println("Queue is Full, cannot insert an item");
        }
        data[ptr] = item;
        ptr++;
        return true;
    }

    //Function to remove an item (In queue, deletion or removal takes place from front)
    public int remove(){
        if (isEmpty()){
            System.out.println("Queue is Empty, cannot remove an item");
        }
        int removed = data[0];

        for (int i = 1; i < ptr; i++) {
            data[i-1] = data[i];
        }
        ptr--;
        return removed;
    }

    //Function to display all the items present currently in queue
    public void display(){
        for (int i = 0; i < ptr; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("End");
    }

    //Function to get that item who is at the very first of the queue(Front)
    public int front(){
        if (isEmpty()){
            System.out.println("Queue is Empty, does not contain any front(element) ");
        }
        return data[0];
    }

    //Function to get that item who is at the very last of the queue(Back)
    public int last(){
        if (isEmpty()){
            System.out.println("Queue is Empty, does not contain any last(element) ");
        }
        return data[ptr];
    }

    //This is our main where we call or initialised the Functions, Variables and Data Structures.
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);

        System.out.println(queue.isEmpty());
        queue.insert(5);
        queue.insert(10);
        queue.insert(15);
        queue.insert(20);
        System.out.println(queue.isFull());
        queue.insert(25);
        System.out.println(queue.isFull());
        System.out.println(queue.remove());
        queue.display();
    }
}
