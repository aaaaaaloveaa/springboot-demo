package com.java.springbootdemo.huawei.ludeng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author lch
 * @create 2020-03-27 9:57
 */
public class Test1 {

    /**
     * V先生有一天工作到很晚，回家的时候要穿过一条长l的笔直的街道，这条街道上有n个路灯。假设这条街起点为0，终点为l，第i个路灯坐标为ai。
     * 路灯发光能力以正数d来衡量，其中d表示路灯能够照亮的街道上的点与路灯的最远距离，所有路灯发光能力相同。
     * 为了让V先生看清回家的路，路灯必须照亮整条街道，又为了节省电力希望找到最小的d是多少？
     *
     * 输入：
     * 输入两行数据，第一行是两个整数：路灯数目n (1≤n≤1000)，街道长度l (1 ≤l≤109)。第二行有n个整数ai (0 ≤ ai≤ l)，
     * 表示路灯坐标，多个路灯可以在同一个点，也可以安放在终点位置。
     * 样例输入
     * 7 15
     * 15 5 3 7 9 14 0
     *
     * 输出：
     * 输出能够照亮整个街道的最小d，保留两位小数。
     * 样例输出
     * 2.50
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {

            String str = scanner.nextLine();
            String[] ss = str.split(" ");
            int n = Integer.parseInt(ss[0]);
            int l = Integer.parseInt(ss[1]);

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(scanner.nextInt());
            }
            Collections.sort(list);
            double max = 0;
            for (int i = 0; i < list.size(); i++) {
                if (i==list.size()-1) {
                    break;
                }
                if (max<list.get(i+1)-list.get(i)) {
                    max = list.get(i+1)-list.get(i);
                }
            }
            max = max/2;

            if (max<list.get(0)) max = list.get(0);
            if (max>list.get(list.size()-1)) max = list.get(list.size()-1);
            System.out.printf("%.2f",max);

        }

    }
}
