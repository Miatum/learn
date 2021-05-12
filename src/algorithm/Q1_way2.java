package algorithm;

import java.util.Scanner;
public class Q1_way2 {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int length = 0;
        while (in.hasNextLine()){
            String str = in.nextLine();
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i++){
                if (!aeiou(str.charAt(i))){
                    str.replace(str.charAt(i),' ');
                }
            }
            System.out.println(str);
            String strs[] = str.split(" ");
            for (int i = 0; i < strs.length; i++){
                if (strs[i].length() > length && !strs[i].equals(" ")){
                    length = strs[i].length();
                }
            }
            System.out.print(length);
        }
    }
    public static boolean aeiou(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        } else{
            return false;
        }
    }
}
