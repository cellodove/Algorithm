package fast_campuse.a12_merge_sort;

import java.util.ArrayList;

public class MergeSortTest {


    public ArrayList<Integer> mergeSort(ArrayList<Integer> sortData){
        if (sortData.size()<=1){
            return sortData;
        }
        int middlePoint = sortData.size() / 2;

        ArrayList<Integer> leftData;
        ArrayList<Integer> rightData;

        leftData = mergeSort(new ArrayList<>(sortData.subList(0,middlePoint)));
        rightData = mergeSort(new ArrayList<>(sortData.subList(middlePoint,sortData.size())));

        return sortingModule(leftData,rightData);
    }

    private ArrayList<Integer> sortingModule(ArrayList<Integer> leftList,ArrayList<Integer> rightList){
        ArrayList<Integer> finishMergeData = new ArrayList<>();

        int leftPosition = 0;
        int rightPosition = 0;


        while (leftList.size()>leftPosition && rightList.size()>rightPosition){
            if (leftList.get(leftPosition) > rightList.get(rightPosition)){
                finishMergeData.add(rightList.get(rightPosition));
                rightPosition++;
            }else {
                finishMergeData.add(leftList.get(leftPosition));
                leftPosition++;
            }
        }

        while (leftList.size()>leftPosition){
            finishMergeData.add(leftList.get(leftPosition));
            leftPosition++;
        }

        while (rightList.size()>rightPosition){
            finishMergeData.add(rightList.get(rightPosition));
            rightPosition++;
        }

        return finishMergeData;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<>();

        for (int i = 0; i<=100; i++){
            testData.add((int) (Math.random()*100));
        }

        System.out.println(testData);
        MergeSortTest mergeSortTest = new MergeSortTest();
        System.out.println(mergeSortTest.mergeSort(testData));

    }
}
