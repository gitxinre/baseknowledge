package com.ly.dp23.proxy;

import org.junit.Test;

/**
 * @author Administrator
 * @date 2018/12/29 14:46
 */
public class CglibProxyHandlerTest {

    @Test
    public void testSing() {

        RealStar proxyInstance = (RealStar) new CglibProxyHandler(new RealStar()).getProxyInstance();
        proxyInstance.sing();
        System.out.println("OK!");

    }

}