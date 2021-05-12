package base03;

import java.util.BitSet;

/**
 * @Description
 * @ClassName javabitset
 * @Author Miatum
 * @date 2021.04.07 10:07
 */
public class JavaBitset {
    BitSet bs1 = new BitSet(10);
    BitSet bs2 = new BitSet(10);
    public JavaBitset() {
        // BitSet赋值
        bs1.set(10);
        bs1.set(20);
        bs1.set(30);
        bs1.set(40);
        bs1.set(50);
        bs2.set(60);
        bs2.set(70);
        bs2.set(50);
        bs2.set(40);
        bs2.set(30);
        System.out.println("bs1:" + bs1);
        System.out.println("bs2:" + bs2);
    }
    // 逻辑与操作
    public void and() {
        bs1.and(bs2);
        System.out.println("bs1.and(bs2): " + bs1);
    }
    // By using andNot(BitSet) method is to returns
    // all the bits that does not match the bits of given
    // BitSet, 返回bs1中所有在bs2中没有匹配到的位
    public void andNot() {
        bs1.andNot(bs2);
        System.out.println("bs1.andNot(bs2):" + bs1);
    }
    //or
    public void or() {
        bs1.or(bs2);
        System.out.println("bs1.or(bs2):" + bs1);
    }
}
