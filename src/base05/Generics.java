package base05;

import base02.Blog;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @ClassName Generics-泛型类, 以下方法基本照抄Array List源码
 * @Author Miatum
 * @date 2021.04.08 11:27
 */
public class Generics <T> {
    int size;
    int cursor;
    Object[] elmentData;
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENTDATA = {};
    // ArrayList的无参构造方法
    public Generics() {
        this.elmentData = EMPTY_ELEMENTDATA;
    }
    // ArrayList size
    public int size() {
        return size;
    }
    // 添加元素
    public boolean add(T t) {
        if (cursor < size) {
            elmentData[cursor] = t;
        } else {
            this.elmentData = grow();
        }
        cursor += 1;
        size += 1;
        return true;
    }
    // 扩增
    private Object[] grow() {
        return Arrays.copyOf(elmentData, size + 1);
    }
    // 访问元素
    public T get(int index) {
        return (T)elmentData[index];
    }
    // 打印数组的泛型方法
    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.println(element);
        }
    }
    // 三个值中取最大值的泛型方法，限制参数类型
    public static <T extends Comparable<T>> T maximun(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
    // 限制参数类型为Blog及其子类
    public static <T extends Blog> void printContent(T o) {
        System.out.println(o.content);
    }
    // 多个限制上界（与关系）, 因为Java是单继承机制，类上界只有一个写在第一个，而后写接口上界
    public static <T extends Blog & Cloneable & Serializable> void multiLimited(T o) {
        System.out.println(o.getClass());
    }
    // 类型通配符
    public static int length(List<?> arr) {
        return arr.size();
    }
}
