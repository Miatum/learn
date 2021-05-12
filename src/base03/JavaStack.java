package base03;

import java.util.Stack;

/**
 * @Description
 * @ClassName JavaStack
 * @Author Miatum
 * @date 2021.04.07 14:32
 */
// Stack是Vector的子类
public class JavaStack extends JavaVector {
    Stack stack = new Stack();
    public JavaStack() {
        stack.add("spring");
        stack.add("summer");
        stack.add("autum");
        stack.add("winter");
    }
    // 是否为空栈
    public void empty() {
        System.out.println("stack.empty():" + stack.empty());
    }
    // 查看栈顶元素
    public void peek() {
        System.out.println("stack.peek():" + stack.peek());
    }
    // 移除栈顶
    public void pop() {
        stack.pop();
        System.out.println("stack.pop():" + stack);
    }
    // 栈顶添加
    public void push() {
        stack.push("push item");
        System.out.println("stack.push():" + stack);
    }
    // 返回值为4，即栈顶位置为1，栈底位置为stack.size()
    public void search() {
        System.out.println("stack.search():" + stack.search("spring"));
    }
}
