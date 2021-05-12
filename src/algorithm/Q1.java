package algorithm;

import java.util.Scanner;
public class Q1 {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int length = 0;
        int res = 0;
        while (in.hasNextLine()){
            String str = in.nextLine();
            str = str.toLowerCase();
            for(int i = 0; i < str.length(); i++){
                if(aeiou(str.charAt(i))){
                    length++;
                    for(int j = i+1; j < str.length(); j++){
                        if(!aeiou(str.charAt(j))){
                            break;
                        }else{
                            length++;
                        }
                    }
                    if(length > res){
                        res = length;
                    }
                    length = 0;
                }

            }
            System.out.print(res);
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
