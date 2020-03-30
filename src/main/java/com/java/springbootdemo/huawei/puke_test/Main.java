package com.java.springbootdemo.huawei.puke_test;

import java.util.*;
/**
 * @author lch
 * @create 2020-03-25 17:57
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            String str = scanner.nextLine();
            String[] ss = str.split("-");

            if ("joker JOKER".equals(ss[0]) || "joker JOKER".equals(ss[1])) {
                System.out.println("joker JOKER");
                continue;
            }

            String[] s1 = ss[0].split(" ");
            String[] s2 = ss[1].split(" ");

            int length0 = s1.length;
            int length1 = s2.length;

            if (length0 == 4 || length1 == 4) {

            }

            if (length0!=length1) {
                System.out.println("ERROR");
                continue;
            }



        }
    }

    public static String[] fun(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "J":arr[i]="11";break;
                case "Q":arr[i]="12";break;
                case "K":arr[i]="13";break;
                case "A":arr[i]="14";break;
                case "2":arr[i]="15";break;
            }
        }
        return arr;
    }

}
