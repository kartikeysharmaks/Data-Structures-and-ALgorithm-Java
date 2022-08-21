public class DynamicStack extends CustomStack {

    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item){
        if (isFull()){
            int [] temp = new int [data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        super.push(item);
        return true;
    }

    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack(4);

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
