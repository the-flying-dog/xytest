package doudizhu;

import org.jetbrains.annotations.NotNull;

public class Poker implements Comparable<Poker>{
    private String cardFace;
    private String num;

    public String getCardFace() {
        return cardFace;
    }

    public void setCardFace(String cardFace) {
        this.cardFace = cardFace;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Poker() {
    }

    public Poker(String cardFace, String num) {
        this.cardFace = cardFace;
        this.num = num;
    }

    @Override
    public int compareTo(@NotNull Poker o) {
        if(Integer.parseInt(this.num) < Integer.parseInt(o.getNum()) ){
            return -1;
        }
        if(Integer.parseInt(this.num) >= Integer.parseInt(o.getNum()) ){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return cardFace;
    }
}
