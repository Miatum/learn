package HUAWEI;

import java.util.Scanner;

public class Q6 {
    /**
    *@Author: miatum
    *@Description: 给定n个字符串，请对n个字符串按照字典序排列。如果没有重复字符串，用TreeSet代码会简单很多
    *@Date: 9:25 2020/10/21
    */
    public static void answer(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] words = new String[n];
        while(scan.hasNextLine()){
            if(n == words.length){
                scan.nextLine();
                n--;
            }else{
                words[n] = scan.nextLine();
                n--;
                if(n == -1){
                    sort(words);
                }
            }
        }
    }
    public static void sort(String[] words){
        for(int i = 0;i < words.length - 1;i++){
            for(int j = i + 1;j < words.length;j++){
                if (words[j].equals(compare(words[i],words[j]))){
                    String temp =words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        for(String word : words){
            System.out.println(word);
        }
    }
    public static String compare(String a , String b){
        String res = "";
        int i = a.length()<b.length()?a.length():b.length();
        int j = 0;
        while(j < i){
            if(a.charAt(j) == b.charAt(j)){
                j++;
            }else if(a.charAt(j)<b.charAt(j)){
                res = a;
                break;
            }else{
                res = b;
                break;
            }
        }
        if(i == j){
            res = a.length()<b.length()?a:b;
        }
        return res;
    }
}
