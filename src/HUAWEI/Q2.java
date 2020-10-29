package HUAWEI;

import java.util.Scanner;
/**
*@Author: miatum
*@Description: 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。0xA  0xAA
*@Date: 3:02 2020/10/21
*/
public class Q2 {
    public void answer(){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            String s = scan.nextLine().substring(2);
            System.out.println(Integer.parseInt(s,16));
        }
    }
}
