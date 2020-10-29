package HUAWEI;
import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;
public class Q10 {
    /**
    *@Author: miatum
    *@Description: 开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
     *
     *
     * 处理：
     *
     *
     * 1、 记录最多8条错误记录，循环记录，最后只用输出最后出现的八条错误记录。对相同的错误记录只记录一条，但是错误计数增加。最后一个斜杠后面的带后缀名的部分（保留最后16位）和行号完全匹配的记录才做算是”相同“的错误记录。
     *
     * 2、 超过16个字符的文件名称，只记录文件的最后有效16个字符；
     *
     * 3、 输入的文件可能带路径，记录文件名称不能带路径。
    *@Date: 10:10 2020/10/27
    */
    public static void answer(String args[]){
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String,Integer> map = new LinkedHashMap();
        while(scanner.hasNextLine()){
            String input = scanner.nextLine();
            String str[] = input.split("\\ ");
            String fileName = str[0].substring(str[0].lastIndexOf("\\") + 1);
            String lineNumber = str[1];
            if(fileName.length() > 16){
                fileName = fileName.substring(fileName.length()-16,fileName.length());
            }
            if(map.containsKey(fileName + " " + lineNumber)){
                for(Map.Entry entry : map.entrySet()){
                    if(entry.getKey().equals(fileName + " " + lineNumber)){
                        entry.setValue((int)entry.getValue()+1);
                    }
                }
            }else{
                map.put(fileName + " " + lineNumber, 1);
            }
        }
        int count = 0;
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            if(count >= map.size() - 8){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            count++;
        }
        scanner.close();

    }
}
