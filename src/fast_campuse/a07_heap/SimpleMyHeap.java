package fast_campuse.a07_heap;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleMyHeap {
    public ArrayList<Integer> heapArray = null;

    public SimpleMyHeap(Integer data){
        heapArray = new ArrayList<>();
        heapArray.add(null);
        heapArray.add(data);
    }

    //순서대로 넣기만함
    public boolean insert(Integer data){
        if (heapArray == null) {
            heapArray = new ArrayList<>();
            heapArray.add(null);
            heapArray.add(data);
        }else {
            heapArray.add(data);
        }
        return true;
    }

    public Integer pop(){
        if (this.heapArray == null){
            return null;
        }else {
            return this.heapArray.get(1);
        }
    }

    public static void main(String[] args) {

        SimpleMyHeap heapTest = new SimpleMyHeap(15);
        heapTest.insert(10);
        heapTest.insert(8);
        heapTest.insert(5);
        heapTest.insert(4);
        heapTest.insert(20);
        System.out.println(heapTest.heapArray);

        heapTest.pop();
        System.out.println(heapTest.heapArray);
    }
}
