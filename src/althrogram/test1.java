package althrogram;
import java.util.*;
public class test1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        //boolean flag = false;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(stack.isEmpty()) {
                stack.push(c);
            }else{
                char temp = stack.peek();
                if(c == map.get(temp)) {
                    stack.pop();
                }else if(c == '('||c=='['||c=='{'){
                    stack.push(c);
                }else{
                    break;
                }
            }
        }
        if(!stack.isEmpty()) {
            System.out.println("false");
        }else{
            System.out.println("true");
        }



    }
}
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//
//        有效字符串需满足：
//        左括号必须用相同类型的右括号闭合。
//        左括号必须以正确的顺序闭合。
//
//
//        示例 1：
//        输入：s = "()"
//        输出：true
//
//        示例 2：
//        输入：s = "()[]{}"
//        输出：true
//
//        示例 3：
//        输入：s = "(]"
//        输出：false
//
//        示例 4：
//        输入：s = "([)]"
//        输出：false
//
//        示例 5：
//        输入：s = "{[]}"
//        输出：true

