package com.java.springbootdemo.huawei.zhajinhua;

import java.util.*;

/**
 * @author lch
 * @create 2020-03-25 15:21
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            ArrayList<People> peoples = new ArrayList<>();
            Scanner scn = new Scanner(System.in);
            for (int i = 0; i < n; i++) {
                People people = new People();
                String str = scn.nextLine();
                String[] arr3 = str.split(" ");
                fapai(people,arr3);
                peoples.add(people);
            }
            int maxFlag = 0;
            for (int i = 0; i < peoples.size(); i++) {
                // 分等级排序
                level(peoples.get(i));
                System.out.println("第"+(i+1)+"个人的牌为:"+peoples.get(i).card.card_3[0]+" "+
                        peoples.get(i).card.card_3[1]+" "+peoples.get(i).card.card_3[2]+ "等级:"+peoples.get(i).card.flag);
                // 查询等级最高的那个
                int flag = peoples.get(i).card.flag;
                if (peoples.get(i).card.flag > maxFlag){
                    maxFlag = peoples.get(i).card.flag;
                }
            }
            // 豹子 顺子 对子 一般牌  分等级
            System.out.println("最大牌的等级为:"+maxFlag);
            // 筛选
            ArrayList<People> peos = new ArrayList<>();
            for (People people : peoples) {
                if (people.card.flag == maxFlag) {
                    peos.add(people);
                }
            }
            // 筛选最大的
            People p = cal(peos);
            System.out.println("获胜者牌为:"+p.card.card_3[0]+" "+p.card.card_3[1]+ " " +p.card.card_3[2]);
        }

    }

    public static People cal(List<People> list) {
        People people = null;
        if (list.size() == 1) {
            people = list.get(0);
        }else {
            people = list.get(0);
            for (People people1 : list) {
                people = people.compareTo(people1);
            }
        }
        return people;
    }

    public static void level(People p) {
        // 排序
        int[] card3 = p.card.card3;
        Arrays.sort(card3);
        int temp = card3[0];
        card3[0] = card3[2];
        card3[2] = temp;
        if (card3[0] == card3[1] && card3[0] == card3[2] && card3[1] == card3[2]) {
            p.card.flag = 4;
        }else if ((card3[0] == card3[1]+1) && (card3[1] == card3[2]+1)) {
            p.card.flag = 3;
        }else if ((card3[0] == card3[1]) || (card3[0] == card3[2]) || (card3[1] == card3[2])) {
            p.card.flag = 2;
        }else {
            p.card.flag = 1;
        }
    }


    public static void fapai(People p,String[] arr3) {
        p.card.fun(arr3);
    }

}

class People {
    String name = "";
    int win = 0;
    Card card = new Card();

    public People compareTo(People p) {
        int[] card3 = p.card.card3;
        int[] card31 = this.card.card3;
        if (card3[0]>card31[0]) {
            return p;
        }else if (card3[0]==card31[0]) {
            if (card3[1]>card31[1]) {
                return p;
            }else if (card3[1]==card31[1]) {
                if (card3[2]>card31[2] || card3[2]==card31[2]) {
                    return p;
                }else {
                    return this;
                }
            }else {
                return this;
            }
        }else {
            return this;
        }
    }
}

class Card {

    int flag = 0;
    int[] card3 = new int[3];
    String[] card_3 = new String[3];

    public void fun(String[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            card3[i] = Integer.parseInt(arr3[i]);
            switch (card3[i]){
                case 2: card_3[i] = "2";break;
                case 3: card_3[i] = "3";break;
                case 4: card_3[i] = "4";break;
                case 5: card_3[i] = "5";break;
                case 6: card_3[i] = "6";break;
                case 7: card_3[i] = "7";break;
                case 8: card_3[i] = "8";break;
                case 9: card_3[i] = "9";break;
                case 10: card_3[i] = "10";break;
                case 11: card_3[i] = "J";break;
                case 12: card_3[i] = "Q";break;
                case 13: card_3[i] = "K";break;
                case 14: card_3[i] = "A";break;
            }
        }
    }

}
