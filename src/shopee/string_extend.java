package shopee;

import java.util.Scanner;

public class string_extend {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String sb = cin.next();

        System.out.println(computeString(sb));;

    }
    public static String computeString (String str) {
        // write code here
        StringBuilder sb=new StringBuilder("");
        char ch[]=str.toCharArray();
        helper(sb,ch,0,1);
        return sb.toString();
    }

    public static int helper(StringBuilder sb, char[] ch, int index, int k){
        int nextK=0;
        StringBuilder sb1=new StringBuilder("");
        while(index<ch.length){
            if(ch[index]==']'){
                StringBuilder sb2=new StringBuilder(sb1);
                for(int i=0;i<k-1;i++){
                    sb1.append(sb2);
                }
                sb.append(sb1);
                return index;
            }
            else if(ch[index]>=48&&ch[index]<=57){
                nextK=10*nextK+ch[index]-48;
            }
            else if(ch[index]=='['){
                index=helper(sb1,ch,index+1,nextK);
            }
            else if(ch[index]!='*'){
                sb1.append(ch[index]);
            }
            index++;
        }
        sb.append(sb1);
        return index;
    }
}
