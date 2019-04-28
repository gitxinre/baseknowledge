package com.ly.dp23.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Administrator
 * @date 2018/12/26 15:57
 */
public class JdkProxyHandler implements InvocationHandler {

    private Object realObj;

    /**
     * 通过构造方法传递进来真实对象
     *
     * @param realObj 真实对象
     */
    JdkProxyHandler(Object realObj) {
        this.realObj = realObj;
    }

    Object getProxyInstance() {
        return Proxy.newProxyInstance(realObj.getClass().getClassLoader(), realObj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("jdk代理先进行前期准备工作……");

        // 真实明星自己唱
        Object result = method.invoke(this.realObj, args);

        System.out.println("jdk演出完代理进行收尾工作……");
        return result;
    }
}
