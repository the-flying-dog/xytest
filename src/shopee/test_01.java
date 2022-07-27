package shopee;

public class test_01 {
    public static void main(String[] args) {
        System.out.println(calDPDScore("NNYYYYYNNYY"));

    }
    public static int calDPDScore(String dpdInfo) {
        // write code here
        int max = 0;
        int l = 0;
        for(int i = 0; i < dpdInfo.length() - 1; i++) {
            char c = dpdInfo.charAt(i);
            char next = dpdInfo.charAt(i+1);
            if(c == 'Y') {
                l++;
                if(next == 'N') {
                    max = Math.max(l,max);
                    l=0;
                }
            }
        }
        if(dpdInfo.charAt(dpdInfo.length()-1)=='Y') max = Math.max(max,l+1);
        if(max ==0) return 0;
        else if(max > 0 && max<=3) return -10;
        else if(max > 3&&max<=7) return -15;
        else if(max > 7) return -25;
        return max;
    }
}
