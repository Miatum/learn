package HUAWEI;

import java.util.Scanner;

public class Q9 {
    /**
    *@Author: miatum
    *@Description: 请解析IP地址和对应的掩码，进行分类识别。要求按照A/B/C/D/E类地址归类，不合法的地址和掩码单独归类。
     *
     * 所有的IP地址划分为 A,B,C,D,E五类
     *
     * A类地址1.0.0.0~126.255.255.255;
     *
     * B类地址128.0.0.0~191.255.255.255;
     *
     * C类地址192.0.0.0~223.255.255.255;
     *
     * D类地址224.0.0.0~239.255.255.255；
     *
     * E类地址240.0.0.0~255.255.255.255
     *
     *
     * 私网IP范围是：
     *
     * 10.0.0.0～10.255.255.255
     *
     * 172.16.0.0～172.31.255.255
     *
     * 192.168.0.0～192.168.255.255
     *
     *
     * 子网掩码为二进制下前面是连续的1，然后全是0。（例如：255.255.255.32就是一个非法的掩码）
     * 注意二进制下全是1或者全是0均为非法
     *
     * 注意：
     * 1. 类似于【0.*.*.*】和【127.*.*.*】的IP地址不属于上述输入的任意一类，也不属于不合法ip地址，计数时可以忽略
     * 2. 私有IP地址和A,B,C,D,E类地址是不冲突的
    *@Date: 18:37 2020/10/26
    */
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int E = 0;
        int illegal = 0;
        int personal = 0;
        String input,ip,mask = "";
        while(scanner.hasNextLine()){
            input = scanner.nextLine();
            String str[] = input.split("~");
            ip = str[0];
            mask = str[1];
            if (legal(ip, mask)){
                String temp[] = ip.split("\\.");
                int ip_arr[] = new int[4];
                for (int i = 0; i < temp.length; i++){
                    ip_arr[i] = Integer.parseInt(temp[i]);
                }
                if (ip_arr[0] >= 1 && ip_arr[0] <= 126){
                    A++;
                    if (ip_arr[0] == 10){
                        personal++;
                    }
                }else if (ip_arr[0] >= 128 && ip_arr[0] <= 191){
                    B++;
                    if (ip_arr[0] == 172 && (ip_arr[1] >= 16 && ip_arr[1] <= 31)){
                        personal++;
                    }
                }else if (ip_arr[0] >= 192 && ip_arr[0] <= 223){
                    C++;
                    if (ip_arr[0] == 192 && ip_arr[1] == 168){
                        personal++;
                    }
                }else if (ip_arr[0] >= 224 && ip_arr[0] <= 239){
                    D++;
                }else if (ip_arr[0] >= 240 && ip_arr[0] <= 255){
                    E++;
                }
            }else {
                illegal++;
            }
        }
        System.out.println(A + " " + B + " " + C + " " + D + " " + E + " " + illegal + " " + personal);
        scanner.close();
    }
    public static boolean legal(String ip, String mask){
        boolean result = true;
        //掩码
        String mask_arr[] = mask.split("\\.");
        String mask_binary = "";
        for (int i =0; i < mask_arr.length; i++){
            String temp = Integer.toBinaryString(Integer.parseInt(mask_arr[i]));
            for (int j = temp.length(); j < 8; j++){
                temp = "0" + temp;
            }
            mask_binary += temp;
        }
        if (mask_binary.indexOf("0") < mask_binary.lastIndexOf("1")){
            result = false;
        }
        //ip
        String ip_arr[] = ip.split("\\.");

        if (ip_arr.length != 4){
            result = false;
        }else {
            for (int i = 0; i < 4; i++){
                int ip_num = Integer.parseInt(ip_arr[i]);
                if (ip_num < 0 || ip_num > 255){
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
