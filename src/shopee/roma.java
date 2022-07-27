package shopee;

public class roma {
    public static void main(String[] args) {
        System.out.println(romanToInt("MXVI"));

    }
    public static int romanToInt (String s) {
        int ans = 0;
        if(s == null || s.length() == 0) return ans;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch(c){
                case 'I':
                    if(i+1 < s.length()) {
                        char x = s.charAt(i+1);
                        if(x == 'v') {
                            ans += 4;
                            i++;
                        }else
                        if(x == 'X') {
                            ans += 9;
                            i++;
                        }else ans+=1;
                    }else {
                        ans += 1;
                    }
                    break;
                case 'V':
                    ans +=5;
                    break;
                case 'X':
                    if(i+1 < s.length()) {
                        char x = s.charAt(i+1);
                        if(x == 'L') {
                            ans += 40;
                            i++;
                        }else
                        if(x == 'C') {
                            ans += 90;
                            i++;
                        }else ans+=10;
                    }else {
                        ans += 10;
                    }
                    break;
                case 'L':
                    ans += 50;
                    break;
                case 'C':
                    if(i+1 < s.length()) {
                        char x = s.charAt(i+1);
                        if(x == 'D') {
                            ans += 400;
                            i++;
                        }else
                        if(x == 'M') {
                            ans += 900;
                            i++;
                        }else ans +=100;
                    }else {
                        ans += 100;
                    }
                    break;
                case 'D':
                    ans +=500;
                    break;
                case 'M':
                    ans +=1000;
                    break;
            }
        }
        return ans;
    }
}
