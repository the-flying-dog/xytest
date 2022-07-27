package doudizhu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortCard {

    public static void sortCard (ArrayList<Poker> card){
        sort3(card);
    }

    //方法一：类中实现Comparable<>接口的compareTo方法，自己实现比较方法
    public static void sort1(ArrayList<Poker> card){
        int len = card.size();
        for (int i = 0; i < len - 1; i++) {
            for (int j = i+1;j  < len; j++) {
                if(card.get(i).compareTo(card.get(j)) == 1)
                    Collections.swap(card,i,j);
            }
        }
    }

    //方法二：类中实现Comparable<>接口的compareTo方法，调用Collections.sort
    public static void sort2(ArrayList<Poker> card){
        Collections.sort(card);
    }

    //方法三：匿名实现compartor的compare方法
    public static void sort3(ArrayList<Poker> card){
        Collections.sort(card, new Comparator<Poker>() {
            @Override
//            前减后为升序，后减前为倒序
            public int compare(Poker o1, Poker o2) {
                int result;
                result =  Integer.parseInt(o1.getNum()) - Integer.parseInt(o2.getNum());
                if(result == 0){
                    result = o1.getCardFace().compareTo(o2.getCardFace());
                }
                return  result;
            }
        });
    }

}
