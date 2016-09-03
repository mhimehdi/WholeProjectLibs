package com.javaUtils;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by mhafidi on 03/09/2016.
 */
public class DateUtil {

    private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @PostConstruct
    public void initDateFormatter() {
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public static String getStartDate(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, -1);
        String endDate = getDateAsString(cal.getTime());
        return endDate;
    }

    public static String getEndDate(){
        String startDate = getDateAsString(new Date());
        return startDate;
    }

    private static String getDateAsString(Date date){
        try{
            return sdf.format(date);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
