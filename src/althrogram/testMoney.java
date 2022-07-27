package althrogram;
import java.sql.SQLOutput;
import java.util.*;

public class testMoney {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String[] str = cin.nextLine().split(" : ");
        int a = countMoney(str[1]);
        String ans = str[0] + " : " + a;
        System.out.println(ans);
    }
    public static int countMoney(String carNum){
        int num = Integer.parseInt(carNum);
        int sum = 0;
        while(num > 0){
            if(num > 100) {
                sum += 2000 * (num - 100);
                num = 100;
            }else if(num > 60){
                sum += 1500 * (num - 60);
                num = 60;
            }else if(num > 30){
                sum += 1000 * (num - 30);
                num = 30;
            }else if(num > 10){
                sum += 800 * (num - 10);
                num = 10;
            }else{
                sum += 500 * num;
                num = 0;
            }
        }
        return sum;
    }
}
//    试题二
//            以下未4S店的本季度销量
//计算奖金
//
//        低于（包含） 10台，每台奖金500
//        大于10台且低于（包含） 30台 ，每台奖金800
//        大于30台且低于（包含） 60台 ，每台奖金1000[
//        大于60台且低于（包含） 100台 ，每台奖金1500
//        大于100台 每台奖金2000
//
//        Sarah : 60
//        Emily : 35
//        Olivia : 20
//        Sophia : 85
//        Hannah : 38
//        Jacob : 16
//        Lucas : 66
//        Ethan : 83
//        Jackson : 26
//        Aiden : 43

