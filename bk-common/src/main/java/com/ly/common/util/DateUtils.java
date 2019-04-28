package com.ly.common.util;


import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.sql.Date;

/**
 * @author xinre
 * @date 2018/12/28 11:52
 */
public class DateUtils {

    /**
     * 格式化获取两个时间间隔
     *
     * @param start  开始时间字符串
     * @param end    结束时间字符串
     * @param format 字符串转化日期格式
     * @return 时间间隔
     */
    public static String getDurationFormat(String start, String end, String format) {
        return getDurationFormat(start, end, format, false);
    }

    /**
     * 格式化获取两个时间间隔
     *
     * @param start    开始时间字符串
     * @param end      结束时间字符串
     * @param format   字符串转化日期格式
     * @param accurate 精确显示
     * @return 时间间隔
     */
    public static String getDurationFormat(String start, String end, String format, boolean accurate) {
        AssertUtils.hasText("getDurationFormat", "start", start, "end", end, "format", format);
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(format);
        return getDurationFormat(DateTime.parse(start, dateTimeFormatter), DateTime.parse(end, dateTimeFormatter), accurate);
    }

    /**
     * 格式化获取两个时间间隔
     *
     * @param start 开始时间
     * @param end   结束时间
     * @return 时间间隔
     */
    public static String getDurationFormat(Date start, Date end) {
        return getDurationFormat(start, end, false);
    }

    /**
     * 格式化获取两个时间间隔
     *
     * @param start    开始时间
     * @param end      结束时间
     * @param accurate 精确显示
     * @return 时间间隔
     */
    public static String getDurationFormat(Date start, Date end, boolean accurate) {
        AssertUtils.notNull("getDurationFormat", "start", start, "end", end);
        return getDurationFormat(new DateTime(start), new DateTime(end), accurate);
    }


    private static String getDurationFormat(DateTime start, DateTime end, boolean accurate) {
        if (start.isBefore(end) || start.equals(end)) {
            return doDurationFormat(new Period(start, end), accurate);
        } else {
            throw new RuntimeException("[Assertion failed] - this DateTime argument must be [start] <= [end] --- please check");
        }
    }

    private static String doDurationFormat(Period period, boolean accurate) {
        int count = 0;
        int ms = period.getMillis();
        int s = period.getSeconds();
        int m = period.getMinutes();
        int h = period.getHours();
        int d = period.getDays() + period.getWeeks() * 7;
        int M = period.getMonths();
        int y = period.getYears();
        StringBuilder timeInterval = new StringBuilder();

        if (y != 0) {
            timeInterval.append(y).append("年");
            count += 6;
        }
        if (M != 0) {
            timeInterval.append(M).append("个月");
            count += 5;
        }
        if (d != 0) {
            timeInterval.append(d).append("天");
            count += 4;
        }
        if (count > 4 && !accurate) {
            return timeInterval.toString();
        }
        if (h != 0) {
            timeInterval.append(h).append("小时");
            count += 3;
        }
        if (count > 3 && !accurate) {
            return timeInterval.toString();
        }
        if (m != 0) {
            timeInterval.append(m).append("分钟");
            count += 2;
        }
        if (count > 2 && !accurate) {
            return timeInterval.toString();
        }
        if (s != 0) {
            timeInterval.append(s).append("秒");
            count += 1;
        }
        if (count >= 1 && !accurate) {
            return timeInterval.toString();
        }
        /*if (count == 0) {
            if (ms != 0) {
                timeInterval.append(ms).append("毫秒");
                return timeInterval.toString();
            } else {
                return "0毫秒";
            }
        } else {
            return timeInterval.toString();
        }*/
        if (count == 0 && ms != 0) {
            timeInterval.append(ms).append("毫秒");
        } else if (count == 0) {
            return "0毫秒";
        }
        return timeInterval.toString();
    }

}
