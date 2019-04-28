package com.ly.dp23.proxy;

/**
 * 真实明星类
 *
 * @author Administrator
 * @date 2018/12/26 15:36
 */
public class RealStar implements IStar {
    @Override
    public void sing() {

        System.out.println("真实明星开始唱歌……啦啦啦啦啦啦……");
    }
}
