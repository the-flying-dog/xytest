package method_test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate1 {
    public static void main(String[] args) throws ParseException {
//        系统自带的返回毫秒值
        System.out.println(System.currentTimeMillis());
//        无参构造
        Date date = new Date();
//        类似于系统自带，返回毫秒值
        System.out.println(date.getTime());
        System.out.println(date);
//        时间格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");
        System.out.println(sdf.format(date));
        System.out.println(sdf.parse("2008年6月13日  6时6分13秒"));
        Date date1 = new Date(0L);
        System.out.println(date1);
        Date date2 = new Date(System.currentTimeMillis());
        System.out.println(date2);

    }
}
