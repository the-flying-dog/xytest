package shopee;

public class test_03 {
    public static void main(String[] args) {
        System.out.println(GetMinCalculateCount(1,2,3,6));

    }
    public static long GetMinCalculateCount(long sourceX, long sourceY, long targetX, long targetY) {
        // write code here
        if(sourceX > targetX||sourceY>targetY) return -1;
        if(sourceX == targetX && sourceY == targetY) {
            return 0;
        }
        long left = GetMinCalculateCount(sourceX + 1,sourceY + 1,targetX,targetY);
        long right = GetMinCalculateCount(sourceX * 2,sourceY * 2,targetX,targetY);
        if(left == -1 && right == -1) return -1;
        if(left == -1) {
            return right +1;
        }
        if(right == -1) {
            return left + 1;
        }
        return Math.min(left,right) + 1;

    }

}
