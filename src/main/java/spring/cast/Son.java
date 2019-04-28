package spring.cast;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @date 2018/9/26 14:11
 */
public class Son extends Father {
    @Override
    public void show() {
        System.out.println("Class son show() function!");
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("fl");
        list.add("yf");
        list.add("xf");

        String remove = list.remove(0);
        System.out.println("remove = " + remove);
        System.out.println("ok");


        String beanName = "";
        boolean b = StringUtils.hasText(beanName);
        System.out.println("beanName = " + beanName);
        System.out.println("b = " + b);
        beanName = null;
        boolean b1 = StringUtils.hasText(beanName);
        System.out.println("beanName = " + beanName);
        System.out.println("b1 = " + b1);
        beanName = "yf";
        boolean b2 = StringUtils.hasText(beanName);
        System.out.println("beanName = " + beanName);
        System.out.println("b2 = " + b2);
    }
}
