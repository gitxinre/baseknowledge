package com.ly.dp23.chainofresponsibility.version1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xinre
 * @date 2019/2/28 17:12
 */
public class ClientCall {
    public static void main(String[] args) {
        MyHandler m1 = new MyHandler("1ly - ");
        MyHandler m2 = new MyHandler("2yf - ");
        MyHandler m3 = new MyHandler("3xy - ");

        m1.setHandler(m2);
        m2.setHandler(m3);
        m1.operator();
    }

    public void cycle() {
        List<AbstractHandler> handlers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            handlers.add(new MyHandler("yf - " + (i + 1) + " "));
        }

        for (int i = 0; i < handlers.size() - 1; i++) {
            handlers.get(i).setHandler(handlers.get(i + 1));
        }
    }
}
