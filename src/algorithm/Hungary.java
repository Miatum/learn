package algorithm;

import java.util.*;

/**
 * @Description 匈牙利算法,素数伴侣
 * 若两个正整数的和为素数，则这两个正整数称之为“素数伴侣”，如2和5、6和13，它们能应用于通信加密。现在密码学会请你设计一个程序，从已有的N（N为偶数）个正整数中挑选出若干对组成“素数伴侣”，挑选方案多种多样，例如有4个正整数：2，5，6，13，如果将5和6分为一组中只能得到一组“素数伴侣”，而将2和5、6和13编组将得到两组“素数伴侣”，能组成“素数伴侣”最多的方案称为“最佳方案”，当然密码学会希望你寻找出“最佳方案”。
 * 输入:
 * 有一个正偶数N（N≤100），表示待挑选的自然数的个数。后面给出具体的数字，范围为[2,30000]。
 * 输出:
 * 输出一个整数K，表示你求得的“最佳方案”组成“素数伴侣”的对数。
 * @ClassName Hungary
 * @Author Miatum
 * @date 2021.04.07 16:43
 */
public class Hungary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        while (in.hasNextInt()) {
            if (n == 0) {
                n = in.nextInt();
            } else {
                n--;
                int nextInt = in.nextInt();
                if (nextInt % 2 == 0){
                    even.add(nextInt);
                } else {
                    odd.add(nextInt);
                }
                if (n == 0) {
                    result.add(getResult(odd, even));
                    odd.clear();
                    even.clear();
                }
            }
        }
        for (Integer i : result) {
            System.out.println(i);
        }
    }
    /**
     * @Description
     * @Param used[] 偶数是否已被匹配，0 - 未匹配， 1 - 已匹配; evensMatch[] 偶数匹配奇数结果
     * @return
     * @Author Miatum
     * @Date 2021.04.12 11:28
     **/
    public static int getResult(List<Integer> odd, List<Integer> even) {
        int result = 0;
        int[] evensMatch = new int[even.size()];
        for (int i = 0; i < odd.size(); i++) {
            int[] used = new int[even.size()];
            if (fetch(odd.get(i), even, used, evensMatch)) {
                result++;
            }
        }
        return result;
    }
    public static boolean fetch(int x, List<Integer> even, int[] used, int[] evensMatch) {
        for (int i = 0; i< even.size(); i++) {
            if (isPrimary(x + even.get(i)) && used[i] == 0) {
                used[i] = 1;
                if (evensMatch[i] == 0 || fetch(evensMatch[i], even, used, evensMatch)) {
                    evensMatch[i] = x;
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isPrimary(int num) {
        boolean isPrimary = true;
        if (num != 2) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrimary = false;
                    break;
                }
            }
        }
        return isPrimary;
    }
}
