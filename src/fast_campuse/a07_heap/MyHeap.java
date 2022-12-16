package fast_campuse.a07_heap;

import java.util.ArrayList;
import java.util.Collections;

public class MyHeap {
    public ArrayList<Integer> heapArray = null;

    public MyHeap(Integer data){
        heapArray = new ArrayList<>();
        heapArray.add(null);
        heapArray.add(data);
    }

    //순서대로 넣기만함
    public boolean insert1(Integer data){
        if (heapArray == null) {
            heapArray = new ArrayList<>();
            heapArray.add(null);
            heapArray.add(data);
        }else {
            heapArray.add(data);
        }
        return true;
    }


    public boolean moveUp(Integer inserted_idx){
        if (inserted_idx <=1){
            return false;
        }

        Integer parent_idx = inserted_idx/2;
        return this.heapArray.get(inserted_idx) > this.heapArray.get(parent_idx);
    }

    public boolean insert(Integer data){
        Integer inserted_idx, parent_idx;

        if (heapArray == null){
            heapArray = new ArrayList<>();
            heapArray.add(null);
            heapArray.add(data);
            return true;
        }

        this.heapArray.add(data);
        inserted_idx = this.heapArray.size()-1;
        while (this.moveUp(inserted_idx)){
            parent_idx = inserted_idx/2;
            Collections.swap(this.heapArray,inserted_idx,parent_idx);
            inserted_idx = parent_idx;
        }
        return true;
    }

    public static void main(String[] args) {

        MyHeap heapTest = new MyHeap(15);
        heapTest.insert(10);
        heapTest.insert(8);
        heapTest.insert(5);
        heapTest.insert(4);
        heapTest.insert(20);

        System.out.println(heapTest.heapArray);
    }
}
