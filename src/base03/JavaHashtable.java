package base03;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @Description
 * @ClassName JavaHashtable
 * @Author Miatum
 * @date 2021.04.07 15:10
 */
public class JavaHashtable {
    Map m = new HashMap();
    Hashtable h1 = new Hashtable();
    Hashtable h2 = new Hashtable(10);
    Hashtable h3 = new Hashtable(10, 0.5f);
    Hashtable h4 = new Hashtable(m);
}
