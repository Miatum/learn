package base03;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @Description
 * @ClassName JavaVector
 * @Author Miatum
 * @date 2021.04.07 14:09
 */
public class JavaVector {
    ArrayList arr = new ArrayList(10);
    Vector v1 = new Vector();
    Vector v2 = new Vector(10);
    Vector v3 = new Vector(10, 1);
    Vector v4 = new Vector(arr);

    // add(object o) or add(int index, object o)
    public void add() {
        v1.add("spring");
        v1.add("autum");
        v1.add("winter");
        System.out.println("add(object o):" + v1);
        v1.add(1, "summer");
        System.out.println("add(int index, object o):" + v1);
    }
    // add(Collection c)
    public void addAll() {
        arr.add("Monday");
        arr.add("Tuesday");
        v1.addAll(arr);
        System.out.println("addAll(Collection c):" + v1);
    }
}
