package itheima.demo1;

import java.util.*;

/**
 * 某双色球系统，红球是1-35之间的数据，篮球是1-15之间的数据，一注双色球号码是由6个不重复的号码和1个篮球号码组成的。
 */
public class Test1 {
    public static void main(String[] args) {
        Integer[] arr = {10,12,30,16,7,17,12};
        Set<Integer> myBull = new HashSet<>();
        Random random = new Random();
        while (myBull.size() != 6){
            myBull.add(random.nextInt(35)+1);
        }
        List<Integer> myBull1 = new ArrayList<>();
        myBull1.addAll(myBull);
        myBull1.add(random.nextInt(15) + 1);
        System.out.println(myBull1);
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < myBull1.size()-1; j++) {
                if (arr[i] == (myBull1.get(j))){
                    count++;
                }
            }
        }
        if (arr[arr.length-1] == myBull1.get(myBull1.size()-1))count1++;
        System.out.println("中奖红球数：" +count + "篮球数：" + count1);
    }
}
