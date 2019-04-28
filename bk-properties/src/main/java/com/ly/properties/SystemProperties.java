package com.ly.properties;

import java.util.Properties;

/**
 * @author Administrator
 * @date 2019/1/3 14:22
 */
public class SystemProperties {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        System.out.println("=====================s");
        properties.list(System.out);
        System.out.println("=====================e");
    }
}
