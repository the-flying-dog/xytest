package group;

import red.ComputeUtil;

import java.util.ArrayList;

public class Master extends people{

    public Master() {
    }

    public Master(String name, int money) {
        super(name, money);
    }

    public void getRed(ArrayList<String> list) {
        String str = ComputeUtil.yuanToCent(list.get(0));
        Integer a = new Integer(str);
        int m = a.intValue();
        this.setName(this.getName()+m);
    }
}
