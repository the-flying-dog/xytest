package doudizhu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
//        准备牌
        ArrayList<String> color = new ArrayList<>();
        ArrayList<String> number = new ArrayList<>();
//        ArrayList<String> card = new ArrayList<>();
        ArrayList<Poker> card = new ArrayList<>();
        color.add("梅花");
        color.add("方片");
        color.add("黑桃");
        color.add("红桃");

        for (int i = 2; i < 11; i++) {
            number.add(Integer.toString(i));
        }
        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");
//        card.add("大王");
//        card.add("小王");
        card.add(new Poker("大王","16"));
        card.add(new Poker("小王","15"));
        for(String c:color){
            int i = 1;
            for(String n:number){
                i += 1;
                card.add(new Poker(c + n,i + ""));
            }
        }
        System.out.println(card);
//    洗牌
        Collections.shuffle(card);
//    发牌
        ArrayList<Poker> p1 = new ArrayList<>();
        ArrayList<Poker> p2 = new ArrayList<>();
        ArrayList<Poker> p3 = new ArrayList<>();
        ArrayList<Poker> remain = new ArrayList<>();
        for (int i = 0; i < 51; i++) {
            if(i%3 == 0) p1.add(card.get(i));
            if(i%3 == 1) p2.add(card.get(i));
            if(i%3 == 2) p3.add(card.get(i));
        }
        for (int i =51; i < 54; i++) {
            remain.add(card.get(i));
        }
//    看牌
        System.out.println("第一位玩家的牌"+p1);
        System.out.println("第二位玩家的牌"+p2);
        System.out.println("第三位玩家的牌"+p3);
        System.out.println("剩余的牌"+remain);
//    整理
        SortCard.sortCard(p1);
        System.out.println("输出整理后的牌");
        System.out.println(p1);
        SortCard.sortCard(p2);
        System.out.println(p2);
        SortCard.sortCard(p3);
        System.out.println(p3);
        System.out.println("剩余的牌"+remain);
//        for (int i = 0; i < p1.size(); i++) {
//            System.out.println(p1.get(i).getNum());
//        }

    }


}
