package fast_campuse.a14_squential_search;

import java.util.ArrayList;

public class SequentialSearch {
    public Integer SearchNumberFun(ArrayList<Integer> integers, int searchNumber){
        for (int index = 0; index < integers.size(); index++){
            if (integers.get(index) == searchNumber){
                return integers.get(index);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            testData.add((int)(Math.random() * 100));
        }
        SequentialSearch sequentialSearch = new SequentialSearch();
        System.out.println(sequentialSearch.SearchNumberFun(testData, 63));
    }

}