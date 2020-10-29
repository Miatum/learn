package HUAWEI;
import java.util.*;
public class Q11 {
    /**
    *@Author: miatum
    *@Description: 先输入字典中单词的个数，再输入n个单词作为字典单词。
     * 输入一个单词，查找其在字典中兄弟单词的个数
     * 兄弟单词：字母组成一致，但顺序不一致，如 abc和acb
     * 再输入数字n，即输出兄弟单词的序号
    *@Date: 20:52 2020/10/27
    */
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int length = scanner.nextInt();
            String dictionary[] = new String[length];
            for(int i = 0; i < length;i++){
                dictionary[i] = scanner.next();
            }
            String word = scanner.next();
            List<String> sibling = new ArrayList();
            int nth = scanner.nextInt();
            for(int i = 0; i < length;i++){
                if(!dictionary[i].equals(word) && order(dictionary[i]).equals(order(word))){
                    sibling.add(dictionary[i]);
                }
            }
            Collections.sort(sibling);
            System.out.println(sibling.size());
            if(sibling.size() >= nth){
                System.out.println(sibling.get(nth - 1));
            }
        }
    }
    public static String order(String word){
        char chars[] = word.toCharArray();
        for(int i = 0; i < chars.length - 1; i++){
            for(int j = i + 1; j < chars.length;j++){
                if(chars[i] > chars[j]){
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        word = "";
        for(int i = 0; i < chars.length; i++){
            word = word + chars[i];
        }
        return word;
    }
}
