package base04;

import java.util.ArrayList;

/**
 * @Description
 * @ClassName JavaArrayList
 * @Author Miatum
 * @date 2021.04.08 11:20
 */
public class JavaArrayList {
    // array list元素是对象，基本数据类型只能使用其对应的包装类
    ArrayList<Integer> list = new ArrayList<Integer>();
    public void get(int index) {
        list.get(index);
    }
    public void add() {
        list.add(1);
    }
    public void clear() {
        list.clear();
    }
}
