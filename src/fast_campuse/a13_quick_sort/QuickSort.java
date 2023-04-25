package fast_campuse.a13_quick_sort;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList){
        if (dataList.size()<=1){
            return dataList;
        }

        int pivot = dataList.get(0);
        ArrayList<Integer> leftList = new ArrayList<>();
        ArrayList<Integer> rightList = new ArrayList<>();

        for (int index = 1; index<dataList.size(); index++){
            if (dataList.get(index) < pivot){
                leftList.add(dataList.get(index));
            }else {
                rightList.add(dataList.get(index));
            }
        }

        ArrayList<Integer> mergeList = new ArrayList<>();
        mergeList.addAll(this.sort(leftList));
        mergeList.addAll(Arrays.asList(pivot));
        mergeList.addAll(this.sort(rightList));
        return mergeList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<>();
        for (int index = 0; index < 100; index++) {
            testData.add((int)(Math.random() * 100));
        }
        QuickSort quickSort = new QuickSort();
        quickSort.sort(testData);
    }
}
