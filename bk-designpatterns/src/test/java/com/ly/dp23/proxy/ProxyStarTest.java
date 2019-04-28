package com.ly.dp23.proxy;

import org.junit.Test;

/**
 * @author Administrator
 * @date 2018/12/26 15:47
 */
public class ProxyStarTest {

    @Test
    public void testSing() {
        IStar realStar = new RealStar();
        ProxyStar star = new ProxyStar(realStar);

        star.sing();

    }

}