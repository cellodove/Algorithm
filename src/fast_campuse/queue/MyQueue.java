package fast_campuse.queue;

import java.util.ArrayList;

public class MyQueue<T> {
    private ArrayList<T> queue = new ArrayList<>();

    public void enQueue(T item){
        queue.add(item);
    }

    public T deQueue(){
        if (isEmpty()){
            return null;
        }else {
            return queue.remove(0);
        }
    }

    public Boolean isEmpty(){
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.enQueue("Hello");
        myQueue.enQueue("World");

        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
    }
}
