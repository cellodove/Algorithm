package fast_campuse.a09_selection_sort;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {

    public ArrayList<Integer> sort(ArrayList<Integer> arrayList){
        int lowest;

        //한 칸씩 정렬이되므로 한 칸씩 앞으로 나아간다
        for (int index = 0; index < arrayList.size(); index++){
            //가장 작은 값을 저장할 변수
            lowest = index;

            for (int cursor = index; cursor < arrayList.size(); cursor++){
                //리스트를 순회하여 가장 작은 값을 찾는다.
                if (arrayList.get(lowest) > arrayList.get(cursor)){
                    lowest = cursor;
                }
            }
            //찾은 가장 작은값을 교환한다.
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
