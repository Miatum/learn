package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Q3 {
    public static void main(){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int n = Integer.parseInt(in.nextLine());
            int res = 0;
            List<String[]> ts = new ArrayList<String[]>();
            for (int i = 0; i < n;i++){
                 String strs[] = in.nextLine().split(" ");
                int x1 = Integer.parseInt(strs[1]);
                int y1 = Integer.parseInt(strs[2]);
                int x2 = Integer.parseInt(strs[3]);
                int y2 = Integer.parseInt(strs[4]);
                int area = Math.abs(x1 - x2) * Math.abs(y1 - y2);
                if (strs[0].equals("d")){
                    res = res + area;
                }else {
                    res = res - area;
                }
            }
            System.out.println(res);
        }
    }
}
