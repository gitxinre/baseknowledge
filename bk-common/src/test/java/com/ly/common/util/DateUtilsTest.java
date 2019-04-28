package com.ly.common.util;


import org.junit.Test;

import java.sql.Date;

/**
 * @author xinre
 * @date 2019/4/28 09:50
 */
public class DateUtilsTest {


    @Test
    // argus type is Date
    public void testGetDurationFormat001() {
        Date d1 = new Date(System.currentTimeMillis());
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date d2 = new Date(System.currentTimeMillis());
        String durationFormat = DateUtils.getDurationFormat(d1, d2, true);
        System.out.println("durationFormat = " + durationFormat);
    }

    @Test
    // argus type is String
    public void testGetDurationFormat002() {
        String d1 = "2019-04-05 14:55:26";
        String d2 = "2019-04-05 14:55:35";
        String format = "yyyy-MM-dd HH:mm:ss";
//        String d1 = "12-4月 -19 11.55.58.787000 上午";
//        String d2 = "12-4月 -19 11.55.58.788000 上午";
//        String format = "月 -19 11.55.58.787000 上午";
        String durationFormat = DateUtils.getDurationFormat(d1, d2, format,false);
        System.out.println("durationFormat = " + durationFormat);
    }



}