package com.java.springbootdemo.huawei.ludeng;

import java.util.Scanner;

/**
 * @author lch
 * @create 2020-03-27 13:59
 */
public class Test3 {

    /**
     * 密码是我们生活中非常重要的东东，我们的那么一点不能说的秘密就全靠它了。哇哈哈. 接下来渊子要在密码之上再加一套密码，虽然简单但也安全。
     * 假设渊子原来一个BBS上的密码为zvbo9441987,为了方便记忆，他通过一种算法把这个密码变换成YUANzhi1987，这个密码是他的名字和出生年份，
     * 怎么忘都忘不了，而且可以明目张胆地放在显眼的地方而不被别人知道真正的密码。
     * 他是这么变换的，大家都知道手机上的字母： 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0,
     * 就这么简单，渊子把密码中出现的小写字母都变成对应的数字，数字和其他的符号都不做变换，
     * 声明：密码中没有空格，而密码中出现的大写字母则变成小写之后往后移一位，如：X，先变成小写，再往后移一位，不就是y了嘛，简单吧。记住，z往后移是a哦。
     * 输入：YUANzhi1987   输出：zvbo9441987
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if ('A'<=chars[i] && chars[i]<='Z') {
                    if ('Z' == chars[i]) {
                        chars[i] = 'a';
                    }else {
                        char temp = (char)(chars[i]+1);
                        chars[i] = String.valueOf(temp).toLowerCase().toCharArray()[0];
                    }
                }else {
                    if ('a'<=chars[i] && chars[i]<='c') chars[i] = '2';
                    if ('d'<=chars[i] && chars[i]<='f') chars[i] = '3';
                    if ('g'<=chars[i] && chars[i]<='i') chars[i] = '4';
                    if ('j'<=chars[i] && chars[i]<='l') chars[i] = '5';
                    if ('m'<=chars[i] && chars[i]<='o') chars[i] = '6';
                    if ('p'<=chars[i] && chars[i]<='s') chars[i] = '7';
                    if ('t'<=chars[i] && chars[i]<='v') chars[i] = '8';
                    if ('w'<=chars[i] && chars[i]<='z') chars[i] = '9';
                }
            }
            System.out.println(String.valueOf(chars));
        }

    }

}
