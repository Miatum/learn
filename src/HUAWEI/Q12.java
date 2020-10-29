package HUAWEI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q12 {
    /**
    *@Author: miatum
    *@Description: 题目描述
     * 若两个正整数的和为素数，则这两个正整数称之为“素数伴侣”，如2和5、6和13，它们能应用于通信加密。现在密码学会请你设计一个程序，
     * 从已有的N（N为偶数）个正整数中挑选出若干对组成“素数伴侣”，挑选方案多种多样，
     * 例如有4个正整数：2，5，6，13，如果将5和6分为一组中只能得到一组“素数伴侣”，而将2和5、6和13编组将得到两组“素数伴侣”，能组成“素数伴侣”最多的方案称为“最佳方案”，
     * 当然密码学会希望你寻找出“最佳方案”。
     * 输入:
     * 有一个正偶数N（N≤100），表示待挑选的自然数的个数。后面给出具体的数字，范围为[2,30000]。
     * 输出:
     * 输出一个整数K，表示你求得的“最佳方案”组成“素数伴侣”的对数。
    *@Date: 0:34 2020/10/30
    */
    public static void main(String args[]){
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
        odd.add(5);odd.add(13);
        even.add(2);even.add(6);
        HashMap<Integer,Integer> map = new HashMap();
        for (int i = 0; i < odd.size(); i++){
            for (int j = 0; j < even.size(); j++){
                if (prime(odd.get(i) + even.get(j))){
                    if (!map.containsKey(odd.get(i))){
                        map.put(odd.get(i),even.get(j));
                    }else {
                        for (Map.Entry entry : map.entrySet()){
                            if (entry.getKey() == odd.get(i)){
                                entry.setValue(even.get(j));
                            }
                        }
                    }
                }
            }
        }
        System.out.println(map);
    }
    public static boolean prime(long num){
        int i = 2;
        for (;i < num;i++){
            if(num%i == 0 && i != num){
                break;
            }
        }
        if(i != num){
            return false;
        }else{
            return true;
        }
    }
}
