package com.java.springbootdemo.huawei;

import java.util.*;

/**
 * @author lch
 * @create 2020-03-24 10:43
 */
public class Main {

    public static void main(String[] args) {

        int a = 2;
        String b = "2";
        StringBuilder c = new StringBuilder().append(2);
        fun(a,b,c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    public static void fun(int a,String b,StringBuilder c) {
        a+=2;
        b+="3";
        c.append("3");
    }

    private static void test7() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            String str = scanner.nextLine();
            if (str.length()>20) {
                continue;
            }

            int[] arr = new int[26];
            int min = 100;

            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {

                arr[chars[i]-'a']++;
                min = min>arr[chars[i]-'a']?arr[chars[i]-'a']:min;

            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == min) {

                    char c = (char) (i+97);
                    str = str.replaceAll(String.valueOf(c),"");
                }
            }

            System.out.println(str);

        }
    }

    private static void test6() {
        int min=Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            int n = scanner.nextInt();
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                Scanner scn = new Scanner(System.in);
                String str = scn.nextLine();
                list.add(str);
            }
            Collections.sort(list);
            for (String s : list) {
                System.out.println(s);
            }

        }
    }

    public static void main1(String[] args) {
        Scanner str = new Scanner(System.in);
        SortedMap<Integer,Integer> map = new TreeMap<>();
        int n = Integer.parseInt(str.nextLine());
        for (int i = 0;i<n;i++){
            String[] mid = str.nextLine().split("\\s+");
        }
    }

    private static void test5() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入整数：");
        int num = input.nextInt();
        String a = "";//用字符串拼接
        while(num!=0) {//利用十进制转二进制除2法
            a=num%2+a;
            num=num/2;
        }
        System.out.println(a);
    }

    private static void test4() {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
            Set<Integer> set = new TreeSet();
            for(int i=0;i<n;i++){
                Scanner scanner1 = new Scanner(System.in);
                String str = scanner1.nextLine();
                String[] arr = str.split(" ");
                int a = Integer.parseInt(arr[0]);
                int b = Integer.parseInt(arr[1]);
                set.add(a);
                map.put(new String(a+""),b);
            }
            fun(map,set);
        }
    }

    public static void fun(IdentityHashMap<String,Integer> map,Set<Integer> set){

        HashMap<Integer, Integer> data = new HashMap<>();
        for (Integer item : set) {
            int sum = 0;
            for (String key : map.keySet()) {
                if ((item+"").equals(key)) {
                    sum+=map.get(key);
                }
            }
            data.put(item,sum);
        }
        for (Integer key : data.keySet()) {
            System.out.println(key + " " +data.get(key));
        }
    }

    private static void test3() {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextLine()){
            String s=scanner.nextLine();
            fun(s);
        }
    }

    public static void fun(String s){
        int index = s.indexOf(".");
        String str = s.substring(0,index);
        String str1 = s.substring(index+1);
        String str2 = str1.substring(0,1);
        int a = Integer.parseInt(str2);

        int result = Integer.parseInt(str);
        if (a>=5){
            System.out.println(result+1);
        }else{
            System.out.println(result);
        }
    }

    private static void test2() {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String str = sc.nextLine();
            System.out.println(fun1(str.substring(2)));
        }
    }

    public static int fun1(String s){
        int n=0;
        int count= 0;
        int temp = 0;
        char ch;

        while(count<s.length())
        {
            ch = s.charAt(s.length()-count-1);
            if(ch>='0'&&ch<='9'){
                temp = ch-'0';
            }else if(ch>='A'&&ch<='Z'){
                temp = ch-'A'+10;
            }else if(ch>='a'&&ch<='z'){
                temp = ch-'a'+10;
            }else{
                break;
            }
            n += temp*Math.pow(16,count);
            count++;
        }

        return n;
    }

    private static void test1() {
        Scanner scn = new Scanner(System.in);
        while(true) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0;i < n;i++) {
                arr[i] = scn.nextInt();
            }
            // 排序
            Arrays.sort(arr);
            // 去重
            List list = new ArrayList();
            for (int i = 0;i < arr.length;i++) {
                if(!list.contains(arr[i])) {
                    list.add(arr[i]);
                }
            }
            // shuchu
            for (int i = 0;i < list.size();i++) {
                System.out.println(list.get(i));
            }


        }
    }


}
