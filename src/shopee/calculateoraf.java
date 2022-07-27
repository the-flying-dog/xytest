package shopee;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class calculateoraf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] str = s.toCharArray();
        Deque<Character> num = new LinkedList<>();
        Deque<Character> label = new LinkedList<>();
        for(char c:str){
            if(c == '+'||c=='-'||c=='*'||c=='/'){
                if(label.isEmpty()){
                    label.push(c);
                }
                char ctop = label.peek();
                if(ctop == '*' || ctop == '/'){
                    char l = label.pop();
                    int a = 0;
                    int b = 0;
                    int i = 0;
                    while(num.peek()!='l'){
                        int temp = Integer.parseInt(num.pop().toString());
                        b += Math.pow(10,i)*temp;
                        i++;
                    }
                    num.pop();
                    i=0;
                    while(num.peek()!='l'){
                        int temp = Integer.parseInt(num.pop().toString());
                        a += Math.pow(10,i)*temp;
                        i++;
                    }
                    num.pop();
                    int ans = 0;
                    if(l == '*'){
                        ans = a * b;
                    }
                    if(l == '/'){
                        ans = a / b;
                    }
                    label.push(c);
                }
            }
        }
    }
}
