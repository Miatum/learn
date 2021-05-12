package base03;

import java.util.*;

/**
 * @Description
 * @ClassName JavaDictionary
 * @Author Miatum
 * @date 2021.04.07 14:48
 */
public class JavaDictionary {
    Dictionary dict = new Hashtable();
    public JavaDictionary() {
        dict.put(1, "C");
        dict.put(2, "C++");
        dict.put(3, "JAVA");
        dict.put(4, "PHP");
        dict.put(5, "SFDC");
    }
    // 返回值的枚举
    public void elements() {
        for (Enumeration en = dict.elements(); en.hasMoreElements();) {
            System.out.println(en.nextElement());
        }
    }
    // 返回对应键的值
    public void get() {
        System.out.println(dict.get(1));
    }
    // 是否为空
    public void isEmpty() {
        System.out.println(dict.isEmpty());
    }
    // 返回键的枚举
    public void keys() {
        for (Enumeration en = dict.keys(); en.hasMoreElements();) {
            System.out.println(en.nextElement());
        }
    }
    // 添加键值对
    public void put() {
        dict.put(5, "put value");
        System.out.println(dict);
    }
    // 获取大小
    public void size() {
        System.out.println(dict.size());
    }
}
