package algorithm;

public class Q4 {
    //输出输入数组的所有不重复子集
    public int findLengthOfLCIS(int[] nums) {
        int length = 1;
        int maxLength = 0;
        if (nums.length == 0) {
            return 0;
        }
        else {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1]) {
                    length++;//递增，则当前递增序列长度即length+1
                }else {
                    //递增结束，length和maxLength取较大值赋给maxLength，并初始化length
                    maxLength = maxLength > length ? maxLength : length;
                    length = 1;
                }
            }
        }
        maxLength = maxLength > length ? maxLength : length;//如果输入数组是一个单调递增序列，for循环并不会给maxLength赋值
        return maxLength;
    }
}
