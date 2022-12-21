package fast_campuse.bubble_sort;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {

    public ArrayList<Integer> sort(ArrayList<Integer> arrayList){
        while (true){
            boolean swap = false;
            for (int i = 0; i<arrayList.size()-1; i++){
                if (arrayList.get(i)>arrayList.get(i+1)){
                    Collections.swap(arrayList, i,i+1);
                    swap = true;
                }
            }
            if (!swap){
                break;
            }
        }
        return arrayList;
    }


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(6);

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(bubbleSort.sort(arrayList));
    }
}
