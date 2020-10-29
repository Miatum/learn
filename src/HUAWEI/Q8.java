package HUAWEI;

import java.util.Scanner;

public class Q8 {
    /**
    *@Author: miatum
    *@Description: 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
     *
     * 输入：
     *
     * 合法坐标为A(或者D或者W或者S) + 数字（两位以内）
     *
     * 坐标之间以;分隔。
     *
     * 非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。
     *
     * 下面是一个简单的例子 如：
     *
     * A10;S20;W10;D30;X;A1A;B10A11;;A10;
    *@Date: 10:44 2020/10/23
    */
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char direction = ' '; int move = 0;
        int x = 0, y = 0;
        String strs[] = str.split(";");
        for(int i = 0; i < strs.length; i++){
            if(strs[i].length() == 3 && isnum(strs[i].charAt(1)) && isnum(strs[i].charAt(2))){
                direction = strs[i].charAt(0);
                move = Integer.parseInt(strs[i].substring(1,3));
            }
            if(strs[i].length() == 2 && isnum(strs[i].charAt(1))){
                direction = strs[i].charAt(0);
                move = Integer.parseInt(strs[i].substring(1,2));
            }
            if (direction == 'A'){
                x = x - move;
            }
            if (direction == 'D'){
                x = x + move;
            }
            if (direction == 'W'){
                y = y + move;
            }
            if (direction == 'S'){
                y = y - move;
            }
            direction = ' ';
            move = 0;
            System.out.println(x + "," + y);
        }
    }
    public static boolean isnum(char a){
        return 47 < a && a < 58 ? true : false;
    }
}
