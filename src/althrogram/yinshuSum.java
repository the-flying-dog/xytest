package althrogram;

public class yinshuSum {
    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder();
        ans.append("1,");
        for(int i = 1; i <= 1000; i++){
            if(isOverNum(i)){
                ans.append(i+",");
            }
        }
        String s = ans.substring(0,ans.length()-1);
        System.out.println(s);
    }
    public static boolean isOverNum(int num){
        int sum = 0;
        for(int i = 1; i < num; i++) {
            if(num % i == 0){
                sum += i;
            }
        }
        return sum == num;
    }
}
