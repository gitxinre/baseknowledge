package com.ly.dp23.proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Administrator
 * @date 2018/12/29 13:41
 */
public class CglibProxyHandler implements MethodInterceptor {


    private Object realObj;

    CglibProxyHandler(Object realObj) {
        this.realObj = realObj;
    }

    Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(this.realObj.getClass());
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("cglib start……");
        Object result = methodProxy.invoke(this.realObj, objects);
        System.out.println("cglib end……");

        return result;
    }
}
