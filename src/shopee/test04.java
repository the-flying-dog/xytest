package shopee;

public class test04 {
    public static void main(String[] args) {
        System.out.println(GetMinCalculateCount(1,2,4,6));

    }
    public static long GetMinCalculateCount(long sourceX, long sourceY, long targetX, long targetY) {
        // write code here
        if(sourceX > targetX||sourceY > targetY) return -1;
        if(sourceX == targetX && sourceY == targetY) {
            return 0;
        }
        long right = -1;
        if(targetX%2==0&&targetY%2==0){
            right = GetMinCalculateCount(sourceX,sourceY,targetX / 2,targetY / 2);
        }
        long left = GetMinCalculateCount(sourceX,sourceY,targetX - 1,targetY - 1);

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
