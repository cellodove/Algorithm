package fast_campuse.stack;

import java.util.ArrayList;

public class MyStack<T> {
    private ArrayList<T> stack = new ArrayList<>();
    public void push(T item){
        stack.add(item);
    }

    public T pop(){
        if (isEmpty()){
            return null;
        }else {
            return stack.remove(stack.size()-1);
        }
    }

    public Boolean isEmpty(){
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack();
        myStack.push("a");
        myStack.push("b");
        myStack.push("c");

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }

}
