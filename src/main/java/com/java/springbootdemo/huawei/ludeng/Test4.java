package com.java.springbootdemo.huawei.ludeng;

import java.util.Scanner;

/**
 * @author lch
 * @create 2020-03-27 14:28
 */
public class Test4 {

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        //while (scanner.hasNext()) {
//            String str = scanner.nextLine();
//            //char[] chars = str.toCharArray();
//            int count = 1;
//            int sum = 1;
//            for (int i = 0; i < str.length(); i++) {  // 0 1 2 3  ABBA
//                //char temp = str.charAt(i);
//                for (int j = i; j < str.length(); j++) {
//                    sum++;
//                    String sub = str.substring(i, (j + 1));
//                    if (new StringBuilder(sub).reverse().toString().equals(sub)) {
//                        count = sub.length()>count?sub.length():count;
//                    }
//
//                }
//            }
//            System.out.println(count);
//            //System.out.println(sum);
//            /**
//             * ABCDCBA
//             * ABCDCBA
//             */
//        //}
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String in = scanner.next();
////          System.out.println(getPwdLen(in));
//            StringBuilder sb = new StringBuilder(in);
//            System.out.println(getMaxLen(in, sb.reverse().toString()));
//        }
//        scanner.close();
//    }
//
//    private static int getMaxLen(String s1, String s2) {
//        int len = s1.length();
//        int dp[][] = new int[len+1][len+1];
//        int max = 0;
//        int sum = 0;
//        for (int i=1; i<=len; i++) {
//            for (int j=1; j<=len; j++) {
//                sum++;
//                if (s1.charAt(i-1) == s2.charAt(j-1)) {
//                    dp[i][j] = dp[i-1][j-1] + 1;
//                    if (max < dp[i][j]) {
//                        max = dp[i][j];
//                    }
//                }
//            }
//        }
//        System.out.println("----------"+sum);
//        return max;
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            String reverse = new StringBuilder(str).reverse().toString();
            System.out.println(getNum(str,reverse));
        }
    }

    public static int getNum(String str,String reverse) {

        int m = str.length()+1;
        int n = reverse.length()+1;

        int[][] arr = new int[m][n];
        int num = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (str.charAt(i-1) == reverse.charAt(j-1)) {
                    arr[i][j] = arr[i-1][j-1]+1;
                }else {
                    arr[i][j] = 0;
                }
                if (num < arr[i][j]) {
                    num = arr[i][j];
                }
            }
        }
        return num;
    }


}
