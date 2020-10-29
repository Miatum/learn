package HUAWEI;


import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Q4 {
    public static void answer(){
        /**
        *@Author: miatum
        *@Description: 数据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，
         * 输出按照key值升序进行输出。
        *@Date: 4:44 2020/10/21
        */
        Scanner scan = new Scanner(System.in);
        TreeMap<Integer,Integer> map = new TreeMap<Integer, Integer>();
        int size = 0;
        while (scan.hasNextLine()){
            if (size == 0){
                size = Integer.parseInt(scan.nextLine());
            }else {
                String[] strs = scan.nextLine().split(" ");
                int key = Integer.parseInt(strs[0]);
                int value = Integer.parseInt(strs[1]);
                if (map.containsKey(key)){
                    value = map.get(key) + value;
                    map.put(key,value);
                }else {
                    map.put(key,value);
                }
                size--;
                if (size == 0){
                    Iterator iterator = map.keySet().iterator();
                    while (iterator.hasNext()){
                        int k = (int)iterator.next();
                        int v = (int)map.get(k);
                        System.out.println(k + " " + v);
                    }
                }
            }
        }
    }
}
