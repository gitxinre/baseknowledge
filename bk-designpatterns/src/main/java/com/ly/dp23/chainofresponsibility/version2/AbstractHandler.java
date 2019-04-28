package com.ly.dp23.chainofresponsibility.version2;

/**
 * @author xinre
 * @date 2019/2/28 17:44
 */
public abstract class AbstractHandler implements Handler {

    protected Handler next;

}
