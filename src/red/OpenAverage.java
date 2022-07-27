package red;

import java.util.ArrayList;
//评价分配法则
public class OpenAverage implements OpenMode{
    @Override
    public ArrayList<String> divide(int totalMoney, int totalCount) {
        //红包集合
        ArrayList<String> red = new ArrayList<>();
        int people = totalCount - 1;
        //普通成员红包
        int averageRed = totalMoney / people;
        String aRed = ComputeUtil.centToYuan(averageRed);
        //群主红包
        int masterRed = totalMoney - (averageRed * people);
        String mRed = ComputeUtil.centToYuan(masterRed);
        red.add(mRed);
        for (int i = 0; i < people; i++) {
            red.add(aRed);
        }
        return red;
    }

    @Override
    public void whichOne() {
        System.out.println("平均红包，群主拿剩下的");
    }
}
