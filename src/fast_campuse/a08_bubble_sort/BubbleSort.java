package fast_campuse.a08_bubble_sort;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {

    public ArrayList<Integer> sort(ArrayList<Integer> arrayList){

        //한번 반복할 때마 가장큰수는 배열의 가장 마지막 부분으로 밀린다.
        for (int index = 0; index < arrayList.size()-1; index++){
            boolean swap = false;
            //한번의 반복마다 가장 뒤의 인덱스는 비교하지 않아도 된다.
            for (int i = 0; i<arrayList.size() - 1 - index; i++){
                //만약 뒤의 인덱스가 더 크면 서로 위치를 바꾼다.
                if (arrayList.get(i)>arrayList.get(i+1)){
                    Collections.swap(arrayList, i,i+1);
                    swap = true;
                }
            }
            //만약 한번도 위치 교환이 이루어지지 않으면 정렬이 되었다 판단하고 반목문을 나온다.
            if (!swap){
                break;
            }
        }
        return arrayList;
    }


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            arrayList.add((int)(Math.random() * 100));
        }

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(bubbleSort.sort(arrayList));
    }
}
