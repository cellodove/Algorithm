package fast_campuse.a10_insertion_sort;

import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort {

    public ArrayList<Integer> sort(ArrayList<Integer> arrayList){

        for (int index = 0; index < arrayList.size(); index++){
            for (int cursor = index + 1; cursor > 0; cursor--){ //index+1을 할필요는 없으나 하지않으면 무조건 시작의 한번 조건은 버려지기때문에 +1을 하여 하나의 조건도 버리지 않는다.
                if (arrayList.get(cursor) < arrayList.get(cursor-1)){
                    Collections.swap(arrayList,cursor,cursor-1);
                }else {
                    //이미 앞에서 작다면 그 뒤의 데이터들도 지금 값보다 작기때문에 비교할 필요가 없다.
                    break;
                }
            }
        }

        return arrayList;
    }


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add((int)(Math.random() * 100));
        }

        InsertionSort insertionSort = new InsertionSort();
        System.out.println(insertionSort.sort(arrayList));
    }
}
