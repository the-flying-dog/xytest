package method_test;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
//        快捷键Random.new+alt+enter
        Random r = new Random();
//        快捷键r.nextInt+alt+enter
        int num = r.nextInt(100)+1;

        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("请输入数字");
            int guess = input.nextInt();
            if(num == guess){
                System.out.println("猜对啦");
                break;
            } else if(num > guess){
                System.out.println("猜小啦");
            } else {
                System.out.println("猜大啦");
            }
        }
        System.out.println(num);
    }
}
