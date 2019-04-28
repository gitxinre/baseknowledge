package com.ly.dp23.chainofresponsibility.version1;

/**
 * @author xinre
 * @date 2019/2/28 17:08
 */
public class MyHandler extends AbstractHandler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + "nihaoa!");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
