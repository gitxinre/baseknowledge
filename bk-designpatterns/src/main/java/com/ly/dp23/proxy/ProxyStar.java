package com.ly.dp23.proxy;

/**
 * @author Administrator
 * @date 2018/12/26 15:39
 */
public class ProxyStar implements IStar {

    private IStar star;

    /**
     * 通过构造方法传递进来真实明星类
     *
     * @param star 真实明星对象
     */
    public ProxyStar(IStar star) {
        this.star = star;
    }

    @Override
    public void sing() {

        System.out.println("代理先进行前期准备工作……");

        // 真实明星自己唱
        this.star.sing();

        System.out.println("演出完代理进行收尾工作……");

    }
}
