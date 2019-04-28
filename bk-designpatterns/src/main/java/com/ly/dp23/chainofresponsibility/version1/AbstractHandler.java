package com.ly.dp23.chainofresponsibility.version1;

/**
 * @author xinre
 * @date 2019/2/28 17:06
 */
public abstract class AbstractHandler implements Handler{
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
