package duoyi;
public class dateCount {
    public static void main(String[] args) {
        System.out.println(when(2000,2,21));
    }
    public static boolean isLeap(int year) {
        if(year%4==0&&year%100!=0||year%400==0) {
            return true;
        }
        return false;
    }
    public static int when(int year,int month,int day) {
        int sum = 0;
        for(int i = 1970; i < year; i++) {
            sum += 365;
            if(isLeap(i)){
                sum+=1;
            }
        }
        for(int i = 1; i < month; i++) {
            if(i == 1||i==3||i==5||i==7||i==8||i==10) sum+=31;
            else if(i==4||i==6||i==9||i==11) sum+=30;
            else if(isLeap(year)) sum+=29;
            else sum+=28;
        }
        sum += day;
        int m = (sum - 1 + 4)%7;
        if(m == 0) return 7;
        return m;
    }
}
