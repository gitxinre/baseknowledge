package com.ly.common.util;

import org.springframework.util.Assert;

/**
 * @author xinre
 * @date 2019/4/28 10:10
 */
public class AssertUtils {
    public static void hasText(String... params) {
        int len = params.length;
        if (len < 3 || len % 2 == 0) {
            System.out.println("系统没有校验业务系统传参！");
            return;
        }
        for (int i = 2; i < len; i++) {
            if (i % 2 == 0) {
                Assert.hasText(params[i], "[Assertion failed] - the String argument[" + params[i - 1] + ":" + params[i] + "] to this method[" + params[0] + "] must have text; it must not be null, empty, or blank, 请联系业务系统！");
            }
        }
    }

    public static void notNull(Object... params) {
        int len = params.length;
        if (len < 3 || len % 2 == 0) {
            System.out.println("系统没有校验业务系统传参！");
            return;
        }
        for (int i = 2; i < len; i++) {
            if (i % 2 == 0) {
                Assert.notNull(params[i], "[Assertion failed] - the argument[" + params[i - 1] + "] to this method[" + params[0] + "] is null, 请联系业务系统！");
            }
        }
    }
}
