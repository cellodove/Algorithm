package fast_campuse.a11_recursive_call;

import java.util.ArrayList;

public class Factorial2 {

    public Integer unFactorial(ArrayList<Integer> dataList){
        if (dataList.size() == 0) {
            return 0;
        }
        return dataList.get(0) + this.unFactorial(new ArrayList<Integer>(dataList.subList(1, dataList.size())));
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList();
        for (int data = 0; data < 10; data++) {
            testData.add(data);
        }
        System.out.println(testData);
        System.out.println(testData.subList(1, testData.size() - 1));


        Factorial2 factorial2 = new Factorial2();
        System.out.println(factorial2.unFactorial(testData));
    }
}
