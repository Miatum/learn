package HUAWEI;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Q5 {
    /**
    *@Author: miatum
    *@Description: 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
    *@Date: 5:31 2020/10/21
    */
    public static void answer(){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        char[] b = a.toCharArray();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = b.length - 1;i >= 0;i--){
            set.add(Integer.parseInt(b[i]+""));
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
    }
}
