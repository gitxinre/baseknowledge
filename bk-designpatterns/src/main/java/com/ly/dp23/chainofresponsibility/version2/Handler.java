package com.ly.dp23.chainofresponsibility.version2;

/**
 * @author xinre
 * @date 2019/2/28 17:40
 */
public interface Handler {

    void operator();

    Handler getNext();

    void setNext(Handler handler);
}
