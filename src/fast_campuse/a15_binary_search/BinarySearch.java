package fast_campuse.a15_binary_search;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public boolean searchFun(ArrayList<Integer> dataList, int findData){
        if (dataList.size() ==1 && dataList.get(0) == findData){return true;}
        if (dataList.size() == 1 && dataList.get(0) != findData){return false;}
        if (dataList.size() == 0){return false;}

        int medium = dataList.size() / 2;
        if (findData == dataList.get(medium)){
            return true;
        }else {
            if (findData < dataList.get(medium)){
                return this.searchFun(new ArrayList<>(dataList.subList(0,medium)),findData);
            }else {
                return this.searchFun(new ArrayList<>(dataList.subList(medium,dataList.size())),findData);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<>();
        for (int index = 0; index < 100; index++) {
            testData.add((int)(Math.random() * 100));
        }
        Collections.sort(testData);
        System.out.println(testData);
        BinarySearch bSearch = new BinarySearch();
        System.out.println(bSearch.searchFun(testData, 2));
    }
}
