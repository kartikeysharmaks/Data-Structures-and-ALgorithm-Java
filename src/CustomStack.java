public class CustomStack {
    int [] data;
    private static int DEFAULT_SIZE = 10;

    //ptr in stack is known as top. All the function are performed on top or with the help of top;
    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return ptr == data.length -1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is Full, cannot insert an item!");
            return false;
        }
        ptr++;
        data[ptr]= item;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty, Cannot pop an item!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty, Cannot pop an item!");
        }
        int display = data[ptr];
        return display;
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(4);

        System.out.println(stack.isEmpty());
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        System.out.println(stack.isFull());
        stack.push(25);
        System.out.println(stack.isFull());
        System.out.println(stack.pop());
    }
}
