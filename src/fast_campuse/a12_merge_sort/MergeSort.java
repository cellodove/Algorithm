package fast_campuse.a12_merge_sort;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public void splitFunc(ArrayList<Integer> dataList){
        if (dataList.size()<=1){
            return;
        }
        int medium = dataList.size()/2;

        ArrayList<Integer> leftArr;
        ArrayList<Integer> rightArr;

        leftArr = new ArrayList<>(dataList.subList(0,medium));
        rightArr = new ArrayList<>(dataList.subList(medium,dataList.size()));

        System.out.println(leftArr);
        System.out.println(rightArr);
    }

    public ArrayList<Integer> mergeSplitFunc(ArrayList<Integer> dataList){
        if (dataList.size()<=1){
            return dataList;
        }

        int medium = dataList.size()/2;
        ArrayList<Integer> leftArr;
        ArrayList<Integer> rightArr;

        leftArr = mergeSplitFunc(new ArrayList<>(dataList.subList(0,medium)));
        rightArr = mergeSplitFunc(new ArrayList<>(dataList.subList(medium,dataList.size())));

        return mergeFunc(leftArr,rightArr);
    }

    public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftArr, ArrayList<Integer> rightArr){
        ArrayList<Integer> mergeList = new ArrayList<>();

        int leftPoint = 0;
        int rightPoint = 0;

        while (leftArr.size()>leftPoint && rightArr.size()>rightPoint){
            if (leftArr.get(leftPoint)>rightArr.get(rightPoint)){
                mergeList.add(rightArr.get(rightPoint));
                rightPoint++;
            }else {
                mergeList.add(leftArr.get(leftPoint));
                leftPoint++;
            }
        }

        while (leftArr.size()>leftPoint){
            mergeList.add(leftArr.get(leftPoint));
            leftPoint++;
        }

        while (rightArr.size()>rightPoint){
            mergeList.add(rightArr.get(rightPoint));
            rightPoint++;
        }

        return mergeList;
    }




    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.splitFunc(new ArrayList<>(Arrays.asList(4,5,2,8,4,9)));
    }
}
