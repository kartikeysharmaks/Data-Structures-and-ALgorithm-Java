package Questions;

import java.util.Stack;

public class MinStack {
    static Stack<StackPair> stack = new Stack<>();

    public static class StackPair{
        int value;
        int currentMin;

        StackPair(int value, int currentMin){
            this.value = value;
            this.currentMin = currentMin;
        }
    }

    public int getMinStack(){
        return stack.peek().currentMin;
    }

    public void push(int value){
        if(stack.isEmpty()){
            stack.push(new StackPair(value,value));
        }else {
            int currentMinInStack = stack.peek().currentMin;
            stack.push(new StackPair(value,Math.min(value,currentMinInStack)));
        }
    }

    public int peek(){
        return stack.peek().value;
    }

    public void pop(){
        if (!stack.isEmpty()){
            stack.pop();
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(3);
        minStack.push(-10);
        minStack.push(6);
        minStack.pop();
        System.out.println(minStack.getMinStack());
        System.out.println(minStack.peek());
        minStack.pop();
        System.out.println(minStack.getMinStack());
        System.out.println(minStack.peek());
    }
}
