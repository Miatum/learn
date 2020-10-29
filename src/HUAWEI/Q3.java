package HUAWEI;
import java.util.Scanner;

public class Q3 {
    /**
    *@Author: miatum
    *@Description: 质因式分解
    *@Date: 3:50 2020/10/21
    */
    public static void answer(){
        String res = "";
        Scanner scan = new Scanner(System.in);
        Long m = scan.nextLong();
        while(!prime(m)){
            for (int i = 2;i < m;i++){
                if(m%i == 0 && prime(i)){
                    m = m/i;
                    res = res + i + " ";
                    break;
                }
            }
        }
        res = res + m + " ";
        System.out.println(res);
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
