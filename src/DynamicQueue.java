public class DynamicQueue extends CustomQueue{
    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item){
        if (isFull()){
            int[] temp = new int [data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.insert(item);
    }

    public static void main(String[] args) {
        DynamicQueue queue = new DynamicQueue(5);

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
        queue.insert(30);
        queue.insert(35);
        queue.insert(40);
        queue.display();
        queue.remove();
        queue.display();
    }
}
