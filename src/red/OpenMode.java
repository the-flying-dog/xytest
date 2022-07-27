package red;

import java.util.ArrayList;

public interface OpenMode {
//    totalMoney必须是整数，以分为单位，后面换算成元
    public abstract ArrayList<String> divide(int totalMoney, int totalCount);
    public abstract void whichOne ();
}
