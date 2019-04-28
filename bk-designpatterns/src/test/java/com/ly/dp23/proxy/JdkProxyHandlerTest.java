package com.ly.dp23.proxy;

import org.junit.Test;

/**
 * @author Administrator
 * @date 2018/12/26 16:17
 */
public class JdkProxyHandlerTest {

    @Test
    public void testSing() {
        IStar proxyInstance = (IStar) new JdkProxyHandler(new RealStar()).getProxyInstance();

        proxyInstance.sing();
        System.out.println("OK!");

    }

}