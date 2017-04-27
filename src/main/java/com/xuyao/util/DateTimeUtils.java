package com.xuyao.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by xuyao on 2017/4/27.
 */
public class DateTimeUtils {
    public static final DateFormat FORMAT_YYYY_MM_DD = new SimpleDateFormat("yyyy-MM-dd");
    public static String[] getMinAndMaxOfMonth(Calendar calendar){
        String[] minMax = new String[2];
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        minMax[0] = FORMAT_YYYY_MM_DD.format(calendar.getTime()) + " 00:00:00";
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        minMax[1] = FORMAT_YYYY_MM_DD.format(calendar.getTime()) + " 23:59:59";
        return minMax;
    }

}
