package com.ly.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author Administrator
 * @date 2019/1/3 15:16
 */
public class LoadInputStream {
    public static void main(String[] args) {


        // 配置文件一定要放在bin目录下边，注意 eclipse 等软件自动将src中的配置文件复制到 bin 目录下
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("properties/db.properties");
        AtomicReference<Properties> propertiesAtomicReference = new AtomicReference<>(new Properties());
        Properties properties = propertiesAtomicReference.get();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Enumeration<?> enumeration = properties.propertyNames();
        while (enumeration.hasMoreElements()) {
            String key = (String) enumeration.nextElement();
            System.out.println("key = " + key);
            String value = properties.getProperty(key);
            System.out.println("value = " + value);
        }

    }
}
