package algorithm;

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String input = in.nextLine();
            String words[] = input.split(" ");
            int count = 0;
            for (int i = 0; i < words.length; i++){
                words[i] = reverse(words[i]);
                count = count + oc(words[i]);
            }
            System.out.println(count);
        }
    }
    public static String reverse(String word){
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--){
            if (97 <= word.charAt(i) && word.charAt(i) <= 122){
                reverse += word.charAt(i);
            }else {
                return word;
            }
        }
        return reverse;
    }
    public static int oc(String word){
        int count = 0;
        for (int i = 0; i < word.length() - 3; i++){
            if (!aeiou(word.charAt(i)) && aeiou(word.charAt(i+1)) && !aeiou(word.charAt(i+2)) && word.charAt(i+2)!='r' && word.charAt(i+3)=='e'){
                count++;
            }
        }
        return count;
    }
    public static boolean aeiou(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        } else{
            return false;
        }
    }
}
