package red;

public class ComputeUtil {
    public static String centToYuan (int cent) {
        int a = cent / 100;
        int b = cent % 100;
        return a + "." + b + "元";
    }

    public static String yuanToCent (String yuan) {
        String[] strs = yuan.split(".");

        String str = strs[0] + strs[1].substring(0,strs.length-2);
        return  str;
//        Integer a = new Integer(strs[0]);
//        int m = a.intValue();
//        Integer b = new Integer(strs[1].substring(0,strs.length-2));
//        int n = b.intValue();
    }
}
