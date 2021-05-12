package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Q5 {
    //对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。
    //
    //给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> K_array = new ArrayList<Integer>();
        if (K == 0) {
            K_array.add(0);
        }else {
            while(K != 0) {
                int temp = K % 10;
                K = (K - temp) / 10;
                K_array.add(temp);
            }
        }
        int maxLength = A.length > K_array.size() ? A.length : K_array.size();
        if (A.length < maxLength) {
            int[] temp = A;
            A = new int[maxLength];
            for (int i = 0; i < temp.length; i++) {
                A[i + maxLength - temp.length] = temp[i];
            }
        }
        if (K_array.size() < maxLength) {
            int numsOfZero = maxLength - K_array.size();
            for (int i = 0; i < numsOfZero; i++) {
                K_array.add(0);
            }
        }
        K_array = reverse(K_array);

        List<Integer> sum = new ArrayList<Integer>();
        int plusOne = 0;
        for (int i = maxLength - 1; i >= 0; i--) {
            int temp = A[i] + K_array.get(i) + plusOne;
            plusOne = 0;
            if (temp < 10) {
                sum.add(temp);
            }else {
                sum.add(temp - 10);
                plusOne = 1;
            }
        }
        if (plusOne == 1) {
            sum.add(1);
        }
        sum = reverse(sum);
        return sum;
    }
    static List<Integer> reverse(List<Integer> AK) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = AK.size() - 1; i >= 0; i--) {
            result.add(AK.get(i));
        }
        return result;
    }
}
