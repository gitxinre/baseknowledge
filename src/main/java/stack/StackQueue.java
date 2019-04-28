package stack;

import java.util.Stack;

/**
 * 两个栈实现队列效果
 *
 * @author xinre
 * @date 2018/9/20 16:09
 */
public class StackQueue<T> {

    // 内置两个实现队列的私有栈

    private Stack<T> s1 = new Stack<>();
    private Stack<T> s2 = new Stack<>();


    /**
     * 入队
     *
     * @param t 元素
     */
    public void push(T t) {
        s1.push(t);
    }

    /**
     * 出队
     *
     * @return 元素
     */
    public synchronized T pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

}
