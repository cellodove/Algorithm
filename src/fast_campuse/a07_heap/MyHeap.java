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

    public boolean moveUp(Integer inserted_idx){
        if (inserted_idx <=1){
            return false;
        }

        Integer parent_idx = inserted_idx/2;
        return this.heapArray.get(inserted_idx) > this.heapArray.get(parent_idx);
    }

    public boolean moveDown(Integer popped_idx){
        Integer left_child_popped_idx, right_child_popped_idx;

        left_child_popped_idx = popped_idx * 2;
        right_child_popped_idx = popped_idx * 2 + 1;

        /* case1 왼쪽 자식도 없을때(모든 자식이 없을때) */
        if (left_child_popped_idx >= this.heapArray.size()){
            return false;

        /* case2 오른쪽 자식 노드만 없을때 */
        }else if(right_child_popped_idx >= this.heapArray.size()){
            if (this.heapArray.get(popped_idx) < this.heapArray.get(left_child_popped_idx)){
                return true;
            }else {
                return false;
            }

        /* case3 왼쪽, 오른쪽 자식 노드가 모두 있을때 */
        }else {
            if (this.heapArray.get(left_child_popped_idx) > this.heapArray.get(right_child_popped_idx)){
                if (this.heapArray.get(popped_idx) < this.heapArray.get(left_child_popped_idx)){
                    return true;
                }else {
                    return false;
                }
            }else {
                if (this.heapArray.get(popped_idx) < this.heapArray.get(right_child_popped_idx)){
                    return true;
                }else {
                    return false;
                }
            }
        }
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

    public Integer pop(){
        Integer returned_data, popped_idx, left_child_popped_idx ,right_child_popped_idx;

        if (this.heapArray.size() <= 1){
            return null;
        }

        returned_data = this.heapArray.get(1);
        this.heapArray.set(1, this.heapArray.get(this.heapArray.size()-1));
        this.heapArray.remove(this.heapArray.size()-1);

        popped_idx = 1;

        while (this.moveDown(popped_idx)){
            left_child_popped_idx = popped_idx * 2;
            right_child_popped_idx = popped_idx * 2 + 1;

            if (right_child_popped_idx >= this.heapArray.size()){
                Collections.swap(this.heapArray,popped_idx,left_child_popped_idx);
                popped_idx = left_child_popped_idx;
            }else {
                if (this.heapArray.get(left_child_popped_idx) >  this.heapArray.get(right_child_popped_idx)){
                    if (this.heapArray.get(popped_idx) < this.heapArray.get(left_child_popped_idx)){
                        Collections.swap(this.heapArray,popped_idx,left_child_popped_idx);
                    }
                }else {
                    if (this.heapArray.get(popped_idx) < this.heapArray.get(right_child_popped_idx)){
                        Collections.swap(this.heapArray,popped_idx,right_child_popped_idx);
                    }
                }
            }
        }
        return returned_data;
    }

    public static void main(String[] args) {

        MyHeap heapTest = new MyHeap(15);
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
