package com.java.springbootdemo.huawei.louti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 * 笔试题：楼梯总共N阶，小明可以一次可以跨1步，2步，3步，请用递归求出小明总共有多少种跨法走完这个楼梯。
 *  
 */
public class StairsTest {

    //楼梯总数为N阶
    int starisNum = 5;

    //总共有1步，2步，3步这几种跨法
    int[] ways = {1, 2, 3};


    //统计总共有多少种跨法
    int count = 0;

    //记录每次的具体步数
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    TreeSet<String> strs = new TreeSet<>();

    public StairsTest() {
    }

    public StairsTest(int starisNum) {
        this.starisNum = starisNum;
    }

    /**
     * * 1. 笔试时用的方法，回溯法
     * * @param tempSteps: 暂时走到第几个台阶了
     *      
     */

    void getSum(int tempSteps) {

        if (tempSteps > starisNum)return;

        //达到要求了，计数加一，并输出具体的步数
        if (tempSteps == starisNum) {
            count++;
            System.out.println(count + " 具体步法为：" + list);
            list1.addAll(list);
            Collections.sort(list1);
            String str = list1.toString();
            strs.add(str);
            list1.clear();
            return;
        }

        //到达一个状态时，都先尝试走下所有的分支可能，然后再依次回退，这样就可以回溯遍历所有的可能了
        for (int i = 0; i < ways.length; i++) {
            list.add(ways[i]);
            tempSteps += ways[i];
            getSum(tempSteps);
            tempSteps -= ways[i];
            list.remove(list.size() - 1);
        }

    }


    /**
     *      * 2. 参考网上的方法：类似斐波那契数列的递归方法，应用的是动态规划的思想，一个状态可由前面的状态求出
     *      * 不过这种方式没法打印出具体的步法，只能是一个总的步数
     *      *
     *      * 估计面试官可能想要的是这个答案
     *      *
     *      * 走到第k阶, 往前只回退一步，只有三种走法：
     *      * a) 从k-1阶梯，步子大小为1
     *      * b) 从k-2阶梯，步子大小为2
     *      * c) 从k-3阶梯，步子大小为3
     *      * 所以自然第k阶的玩法就是：getSum2(n - 1) + getSum2(n - 2) + getSum2(n - 3)
     *      *
     *      * @param args: n 走到第n阶时可以有多少种走法
     *      
     */

    int getSum2(int n) {
        switch (n) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            default:
                return getSum2(n - 1) + getSum2(n - 2) + getSum2(n - 3);
        }
    }


     /***
         * 3. 思想类似方法二
         * 既然这个可以看作经典的那个斐波那契数列的变形，那么自然也就有非递归的玩法了
         *
         * @param n
         * @return
         */
    int getSum3(int n) {
        switch (n) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            default:
                int result = 0;
                //当然也可以kind数组也可以申请为n位，kind[n-1]就表示为n阶楼梯的走法，只是这么浪费空间而已
                int[] kind = {1, 2, 4};
                for (int i = 4; i <= n; i++) {
                    result = kind[0] + kind[1] + kind[2];
                    kind[0] = kind[1];
                    kind[1] = kind[2];
                    kind[2] = result;
                }
                return result;
        }
    }


    public static void main(String[] args) {

        StairsTest st = new StairsTest(10);

        //方法一：回溯法，递归
        st.getSum(0);
        System.out.println("a) 总共的步数：" + st.count);
        System.out.println("----------------------------------");
        // System.out.println(st.strs);
        for (String str : st.strs) {
            System.out.println(str);
        }
        System.out.println(st.strs.size());
        System.out.println("----------------------------------");

        //方法二：动态规划，类似斐波那契数列，递归
        System.out.println("\nb) 总共的步数：" + st.getSum2(st.starisNum));

        //方法三：动态规划，类似斐波那契数列，非递归
        System.out.println("\nc) 总共的步数：" + st.getSum3(st.starisNum));

    }

}
