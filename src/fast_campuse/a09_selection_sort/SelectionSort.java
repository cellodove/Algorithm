package fast_campuse.a09_selection_sort;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {

    public ArrayList<Integer> sort(ArrayList<Integer> arrayList){
        int lowest;

        for (int index = 0; index < arrayList.size(); index++){
            lowest = index;

            for (int cursor = index; cursor < arrayList.size(); cursor++){
                if (arrayList.get(lowest) > arrayList.get(cursor)){
                    lowest = cursor;
                }
            }
            Collections.swap(arrayList,index, lowest);
        }

        return arrayList;
    }


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add((int)(Math.random() * 100));
        }

        SelectionSort selectionSort = new SelectionSort();
        System.out.println(selectionSort.sort(arrayList));
    }
}
