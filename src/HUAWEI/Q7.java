package HUAWEI;

import java.util.Scanner;

public class Q7 {
    /**
    *@Author: miatum
    *@Description: 王强今天很开心，公司发给N元的年终奖。王强决定把年终奖用于购物，他把想买的物品分为两类：主件与附件，附件是从属于某个主件的，下表就是一些主件与附件的例子：
     * 主件	附件
     * 电脑	打印机，扫描仪
     * 书柜	图书
     * 书桌	台灯，文具
     * 工作椅	无
     * 如果要买归类为附件的物品，必须先买该附件所属的主件。每个主件可以有 0 个、 1 个或 2 个附件。附件不再有从属于自己的附件。
     * 王强想买的东西很多，为了不超出预算，他把每件物品规定了一个重要度，分为 5 等：用整数 1 ~ 5 表示，第 5 等最重要。他还从因特网上查到了每件物品的价格（都是 10 元的整数倍）。
     * 他希望在不超过 N 元（可以等于 N 元）的前提下，使每件物品的价格与重要度的乘积的总和最大。
     *     设第 j 件物品的价格为 v[j] ，重要度为 w[j] ，共选中了 k 件物品，编号依次为 j 1 ， j 2 ，……， j k ，则所求的总和为：
     * v[j 1 ]*w[j 1 ]+v[j 2 ]*w[j 2 ]+ … +v[j k ]*w[j k ] 。（其中 * 为乘号）
     *     请你帮助王强设计一个满足要求的购物单。
    *@Date: 9:01 2020/10/23
    */
    public static void answer(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int m = scan.nextInt();
        int price[][] = new int[60][3];
        int value[][] = new int[60][3];
        int res[] = new int[3200];
        int i,j,k;
        for (i = 1; i <= m; i++){
            int p = scan.nextInt();
            int v = scan.nextInt();
            int q = scan.nextInt();
            if (q == 0){
                price[i][0] = p;
                value[i][0] = p * v;
            }else {
                if (price[q][1] == 0){
                    price[q][1] = p;
                    value[q][1] = p * v;
                }else {
                    price[q][2] = p;
                    value[q][2] = p * v;
                }
            }
        }
        for (i = 1; i <= m; i++){
            for (j = N/10; j >= price[i][0]/10; j--){
                if (j >= price[i][0]/10){
                    res[j] = Math.max(res[j], res[j - price[i][0]/10] + value[i][0]);
                }
                k = (price[i][0] + price[i][1])/10;
                if (price[i][1] != 0){
                    if (j >= k){
                        res[j] = Math.max(res[j], res[j - k] + value[i][0] + value[i][1]);
                    }
                }
                k = (price[i][0] + price[i][1] + price[i][2])/10;
                if (price[i][2] != 0){
                    if (j >= k){
                        res[j] = Math.max(res[j], res[j -k] + value[i][0] + value[i][1] + value[i][2]);
                    }
                }
            }
        }
        System.out.println(res[N/10]);
    }
}