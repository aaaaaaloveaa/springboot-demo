package com.java.springbootdemo.huawei_test;

import java.util.*;

/**
 * @author lch
 * @create 2020-02-23 16:45
 */
public class StrLength {

    public static void main(String[] args) {

        //test1();
        //test2();
        //test3();
        //test4();
    }

    public static void test4() {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int num = scan.nextInt();
            int [] arr = new int[num];
            for (int i = 0 ; i<= num - 1 ; i++){
                arr[i] = scan.nextInt();
            }

            //去重
            ArrayList<Integer> newArr = new ArrayList<>();
            for(int j = 0; j < num; j++){   // 1 2 2
                for(int k = j + 1 ; k < num; k++){
                    if(arr[j] == arr[k]){
                        break;
                    }
                    if(k == num -1){
                        newArr.add(arr[j]);
                    }
                }
                if( j == num -1){
                    newArr.add(arr[j]);
                }
            }
            //排序
            for(int i = 0; i < newArr.size() ; i++){
                for( int j = i +1; j < newArr.size() ; j++){
                    if(newArr.get(i) > newArr.get(j)){
                        int temp = newArr.get(i);
                        newArr.set(i,newArr.get(j));
                        newArr.set(j,temp);
                    }
                }
            }

            //输出
            for(int i = 0 ; i<newArr.size(); i++){
                System.out.println(newArr.get(i));
            }
        }
    }

    public static void test3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数n:");
        int n = scanner.nextInt();
        System.out.println("你输入的数整数为:"+n);
        // 产生n个随机数
        ArrayList<Integer> list = new ArrayList<>();
        while (list.size()< n) {
            Integer a = (int)(Math.random()*1000)+1;
            list.add(a);
        }
        System.out.println("前:"+ list + "{长度}"+list.size());
        Set<Integer> integers = new HashSet<>();
        integers.addAll(list);
        System.out.println("去重");
        list.clear();
        list.addAll(integers);
        Collections.sort(list);
        System.out.println("后:"+ list + "{长度}"+list.size());
        System.out.println(list);
    }

    public static void test2() {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        char[] chars = s1.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (s2.equalsIgnoreCase(""+c)){
                ++count;
            }
        }
        System.out.println(count);
    }

    public static void test1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串: ");
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        String res = arr[arr.length - 1];
        System.out.println("结果:"+res);
    }

}
