package althrogram;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
class MyQueue {
    Deque<Integer> queue = new LinkedList<>();
    void poll(int val) {
        if(!queue.isEmpty() && val == queue.peek()){
            queue.poll();
        }
    }
    void add(int val) {
        while(!queue.isEmpty() && val > queue.getLast()) {
            queue.removeLast();
        }
        queue.add(val);
    }
    int peek() {
        return queue.peek();
    }
}

public class slayArray {
    public static void main(String[] args) {

    }
    public static int[] slay (int[] nums,int k) {

        int[] ans = new int[nums.length - k + 1];
        MyQueue queue = new MyQueue();
        for(int i = 0; i < k; i++){
            queue.add(nums[i]);
        }
        int index = 0;
        ans[index] = queue.peek();
        index++;
        for(int i = k; i < nums.length; i++) {
            queue.poll(nums[i-k]);
            queue.add(nums[i]);
            ans[index] = queue.peek();
            index++;
        }

        StringBuilder str = new StringBuilder();
        String s = str.toString();
        return ans;
    }
}
