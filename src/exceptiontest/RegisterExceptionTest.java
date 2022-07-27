package exceptiontest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RegisterExceptionTest {
    static ArrayList<String> userName = new ArrayList<>();

    public static void main(String[] args)  {
        Collections.addAll(userName,"Bob","Tom","Mike","Timi");
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String user = "";
            if(input.hasNext())
                user = input.next();
            checkUserName(user);
        }


    }
////使用抛出异常的方法
//    public static void checkUserName(String user) throws RegisterException {
//        for(String str:userName){
//            if(user.equals(str)){
//                throw new RegisterException("该用户已被注册");
//            }
//        }
//        System.out.println("注册成功");
//        userName.add(user);
//    }

//    使用trycatch
    public static void checkUserName(String user) {
        for(String str:userName){
            if(user.equals(str)){
                try {
                    throw new RegisterException("该用户已被注册");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
//                    使函数结束，否则会继续输出注册成功，
//                    而抛出异常的方法直接结束程序
                }
            }
        }
        System.out.println("注册成功");
        userName.add(user);
    }
}
